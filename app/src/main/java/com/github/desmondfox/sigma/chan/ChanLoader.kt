package com.github.desmondfox.sigma.chan

import android.content.pm.PackageManager
import com.github.desmondfox.chancore.EMPTY_STRING
import com.github.desmondfox.chancore.FEATURE_EXTENSION
import com.github.desmondfox.chancore.METADATA_BOARD
import com.github.desmondfox.chancore.METADATA_NAME
import com.github.desmondfox.chancore.models.Imageboard
import com.github.desmondfox.sigma.SigmaApp
import com.github.desmondfox.sigma.extensions.logD
import com.github.desmondfox.sigma.extensions.logE
import dalvik.system.DexFile
import dalvik.system.PathClassLoader
import java.lang.Exception

class ChanLoader() {

    private val packageManager: PackageManager = SigmaApp.instance.packageManager

    fun loadChans(): List<ChanHolder> {
        val holders = mutableListOf<ChanHolder>()
        packageManager.getInstalledPackages(PackageManager.GET_CONFIGURATIONS)
            .filter { it.reqFeatures?.map { it.name }?.contains(FEATURE_EXTENSION) ?: false }
            .forEach { packageInfo ->
                logD("Found package: ${packageInfo.packageName}")
                try {
                    packageManager.getApplicationInfo(
                        packageInfo.packageName,
                        PackageManager.GET_META_DATA
                    )
                        .let {
                            val metadata = it.metaData
                            it.nativeLibraryDir
                            holders.add(
                                ChanHolder(
                                    metadata.getString(METADATA_NAME, EMPTY_STRING),
                                    packageInfo.packageName,
                                    it.sourceDir,
                                    metadata.getString(METADATA_BOARD, EMPTY_STRING)
                                )
                            )
                        }
                } catch (e: PackageManager.NameNotFoundException) {
                    logE("Package name not found", e)
                }
            }
        return holders
    }

    fun loadInstances(holders: List<ChanHolder>): List<Imageboard> {
        val instances = mutableListOf<Imageboard>()
        holders.forEach {
            try {
                val appInfo = packageManager.getApplicationInfo(it.packageName, PackageManager.GET_META_DATA)
                val classLoader = PathClassLoader(appInfo.sourceDir, Imageboard::class.java.classLoader)
                val loadedClass = Class.forName(it.packageName+it.classPath, false, classLoader)
                instances.add(loadedClass.newInstance() as Imageboard)
            } catch (e: Exception) {
                logE("Error for class loading", e)
            }
        }
        return instances
    }
}