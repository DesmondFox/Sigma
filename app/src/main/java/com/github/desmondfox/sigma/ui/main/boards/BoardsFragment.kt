package com.github.desmondfox.sigma.ui.main.boards

import androidx.fragment.app.Fragment
import com.github.desmondfox.sigma.ui.base.BaseFragment

class BoardsFragment : BaseFragment<BoardsVM>() {
    override val viewModelClass: Class<BoardsVM> = BoardsVM::class.java
}