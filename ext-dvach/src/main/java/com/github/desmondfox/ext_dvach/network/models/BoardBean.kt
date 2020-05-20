package com.github.desmondfox.ext_dvach.network.models

import com.fasterxml.jackson.annotation.JsonProperty
import com.github.desmondfox.chancore.network.base.Bean

data class BoardBean(
    @JsonProperty("category")
    val category: String? = null,
    @JsonProperty("id")
    val id: String? = null,
    @JsonProperty("info")
    val info: String? = null,
    @JsonProperty("name")
    val name: String? = null
) : Bean