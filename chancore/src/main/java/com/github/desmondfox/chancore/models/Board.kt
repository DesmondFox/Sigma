package com.github.desmondfox.chancore.models

import com.github.desmondfox.chancore.EMPTY_STRING

public interface Board : Model {
    val category: String
    val name: String
    val boardId: String
    val boardInfo: String
}

public class BoardModel(
    override val category: String = EMPTY_STRING,
    override val name: String = EMPTY_STRING,
    override val boardId: String = EMPTY_STRING,
    override val boardInfo: String = EMPTY_STRING
) : Board