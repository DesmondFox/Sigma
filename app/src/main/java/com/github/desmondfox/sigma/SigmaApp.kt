package com.github.desmondfox.sigma

import android.app.Application

class SigmaApp : Application() {

    companion object {
        lateinit var instance: SigmaApp
    }

    override fun onCreate() {
        super.onCreate()

        instance = this
    }
}