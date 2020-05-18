package com.github.desmondfox.sigma.ui.main

import android.os.Bundle
import com.github.desmondfox.sigma.R
import com.github.desmondfox.sigma.ui.base.BaseActivity

class MainActivity : BaseActivity() {
    override val containerId: Int = R.id.flMainContainer
    override val layoutId: Int = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}
