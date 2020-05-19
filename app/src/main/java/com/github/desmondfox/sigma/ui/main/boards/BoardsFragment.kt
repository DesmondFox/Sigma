package com.github.desmondfox.sigma.ui.main.boards

import com.github.desmondfox.sigma.R
import com.github.desmondfox.sigma.ui.base.BaseFragment

class BoardsFragment : BaseFragment<BoardsVM>() {

    companion object {
        fun newInstance() = BoardsFragment()
    }

    override val viewModelClass: Class<BoardsVM> = BoardsVM::class.java
    override val layoutId: Int = R.layout.fragment_boards
}