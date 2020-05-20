package com.github.desmondfox.ext_dvach

import com.github.desmondfox.chancore.models.Imageboard
import com.github.desmondfox.chancore.network.base.BoardModule
import com.github.desmondfox.ext_dvach.modules.DvachBoardModule
import com.github.desmondfox.ext_dvach.network.DvachClient
import com.github.desmondfox.ext_dvach.network.api.BoardsApi

class DvachImageboard : Imageboard {

    override val boardModule: BoardModule =
        DvachBoardModule(DvachClient.create(BoardsApi::class.java))
}