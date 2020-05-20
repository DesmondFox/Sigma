package com.github.desmondfox.chancore.models.converters

import com.github.desmondfox.chancore.models.Model
import com.github.desmondfox.chancore.network.base.Bean

abstract class Converter<IN : Bean, OUT : Model> {

    abstract fun inToOut(inObject: IN): OUT?

    abstract fun outToIn(outObject: OUT): IN?

    fun listInToOut(inObjects: List<IN>): List<OUT> =
        inObjects.mapNotNull { inToOut(it) }

    fun listOutToIn(outObjects: List<OUT>): List<IN> =
        outObjects.mapNotNull { outToIn(it) }
}