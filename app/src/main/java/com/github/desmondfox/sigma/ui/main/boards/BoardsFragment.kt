package com.github.desmondfox.sigma.ui.main.boards

import android.os.Bundle
import android.view.View
import com.github.desmondfox.sigma.R
import com.github.desmondfox.sigma.chan.ChanLoader
import com.github.desmondfox.sigma.extensions.logD
import com.github.desmondfox.sigma.extensions.logE
import com.github.desmondfox.sigma.ui.base.BaseFragment
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers

class BoardsFragment : BaseFragment<BoardsVM>() {

    companion object {
        fun newInstance() = BoardsFragment()
    }

    override val viewModelClass: Class<BoardsVM> = BoardsVM::class.java
    override val layoutId: Int = R.layout.fragment_boards

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}