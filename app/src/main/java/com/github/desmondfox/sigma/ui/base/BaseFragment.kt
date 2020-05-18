package com.github.desmondfox.sigma.ui.base

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

abstract class BaseFragment<VM : BaseVM> : Fragment() {
    protected abstract val viewModelClass: Class<VM>
    protected abstract val layoutId: Int

    protected lateinit var viewModel: VM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(viewModelClass)


    }
}