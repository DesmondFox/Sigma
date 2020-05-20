package com.github.desmondfox.ext_dvach.modules

import com.github.desmondfox.chancore.models.Board
import com.github.desmondfox.chancore.network.base.BoardModule
import com.github.desmondfox.ext_dvach.network.api.BoardsApi
import com.github.desmondfox.ext_dvach.network.models.converters.BoardConverter
import io.reactivex.Single

class DvachBoardModule(private val api: BoardsApi) : BoardModule {
    private val converter = BoardConverter()

    //    override val converter: Converter<Bean, Model> = BoardConverter()

    override fun loadBoards(): Single<List<Board>> =
        api.getBoards()
            .map { it.boards }
            .map { converter.listInToOut(it) }
}