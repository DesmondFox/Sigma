package com.github.desmondfox.ext_dvach.network.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ThreadBean(
    @JsonProperty("timestamp")
    val timestamp: String? = null,
    @JsonProperty("files")
    val files: List<AttachmentBean>? = null,
    @JsonProperty("comment")
    val comment: String? = null
)