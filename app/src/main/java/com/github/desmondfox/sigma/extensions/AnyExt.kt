package com.github.desmondfox.sigma.extensions

import android.util.Log

fun Any.logE(text: String, throwable: Throwable) {
    Log.e(javaClass.simpleName, "$text ::${throwable.javaClass.simpleName}")
    throwable.printStackTrace()
}

fun Any.logW(text: String) {
    Log.w(javaClass.simpleName, text)
}

fun Any.logD(text: String) {
    Log.d(javaClass.simpleName, text)
}
