package com.github.desmondfox.sigma.ui.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.github.desmondfox.sigma.extensions.getName

abstract class BaseActivity : AppCompatActivity() {
    protected abstract val containerId: Int
    protected abstract val layoutId: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId)
    }

    protected fun replace(fragment: Fragment, addToBackstack: Boolean = true) {
        supportFragmentManager
            .beginTransaction()
            .replace(containerId, fragment)
            .apply {
                if (addToBackstack)
                    addToBackStack(fragment.getName())
            }
            .commit()
    }
}