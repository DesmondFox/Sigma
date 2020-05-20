package com.github.desmondfox.chancore.network.base

import com.github.desmondfox.chancore.models.Board
import io.reactivex.Single

interface BoardModule : Module {

    fun loadBoards(): Single<List<Board>>
}