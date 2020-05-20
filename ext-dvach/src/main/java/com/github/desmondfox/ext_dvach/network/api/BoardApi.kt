package com.github.desmondfox.ext_dvach.network.api

import com.github.desmondfox.ext_dvach.network.models.BoardsResultBean
import io.reactivex.Single
import retrofit2.http.GET

interface BoardsApi {

    @GET("/boards.json")
    fun getBoards(): Single<BoardsResultBean>
}