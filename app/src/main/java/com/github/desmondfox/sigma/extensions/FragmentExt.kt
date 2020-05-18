package com.github.desmondfox.sigma.extensions

import androidx.fragment.app.Fragment

fun Fragment.getName() =
    this::class.qualifiedName ?: this::class.simpleName