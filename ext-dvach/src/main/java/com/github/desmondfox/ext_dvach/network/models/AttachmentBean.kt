package com.github.desmondfox.ext_dvach.network.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AttachmentBean(
    @JsonProperty("thumbnail")
    val thumbnail: String? = null,
    @JsonProperty("path")
    val path: String? = null,
    @JsonProperty("height")
    val height: Int? = null,
    @JsonProperty("width")
    val width: Int? = null
)