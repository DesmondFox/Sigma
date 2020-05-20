package com.github.desmondfox.ext_dvach.network.models.converters

import com.github.desmondfox.chancore.models.Board
import com.github.desmondfox.chancore.models.BoardModel
import com.github.desmondfox.chancore.models.converters.Converter
import com.github.desmondfox.ext_dvach.network.models.BoardBean

class BoardConverter : Converter<BoardBean, Board>() {

    override fun inToOut(inObject: BoardBean): Board? = inObject.run {
        BoardModel(
            category.orEmpty(),
            name.orEmpty(),
            id.orEmpty(),
            info.orEmpty()
        )
    }

    override fun outToIn(outObject: Board): BoardBean? = null
}