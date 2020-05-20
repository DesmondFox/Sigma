package com.github.desmondfox.sigma.providers.base

import com.github.desmondfox.chancore.network.base.Module

abstract class Provider<MODULE : Module> {

    protected val module: MODULE = this.initModule()

    protected abstract fun initModule(): MODULE
}