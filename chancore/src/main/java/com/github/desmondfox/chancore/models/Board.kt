package com.github.desmondfox.chancore.models

import com.github.desmondfox.chancore.DEFAULT_BUMPLIMIT
import com.github.desmondfox.chancore.DEFAULT_SPEED
import com.github.desmondfox.chancore.DEFAULT_THREADCOUNT
import com.github.desmondfox.chancore.EMPTY_STRING

public interface Board : Model {
    val category: String
    val sageEnabled: Boolean
    val name: String
    val boardId: String
    val boardInfo: String
    val bumpLimit: Int
    val threadsCount: Int
    val speed: Int
}

public class BoardModel(
    override val category: String = EMPTY_STRING,
    override val sageEnabled: Boolean = true,
    override val name: String = EMPTY_STRING,
    override val boardId: String = EMPTY_STRING,
    override val boardInfo: String = EMPTY_STRING,
    override val bumpLimit: Int = DEFAULT_BUMPLIMIT,
    override val threadsCount: Int = DEFAULT_THREADCOUNT,
    override val speed: Int = DEFAULT_SPEED
) : Board