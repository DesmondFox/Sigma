package com.github.desmondfox.ext_dvach.network.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BoardsResultBean(
    @JsonProperty("boards")
    val boards: List<BoardBean>? = null
)