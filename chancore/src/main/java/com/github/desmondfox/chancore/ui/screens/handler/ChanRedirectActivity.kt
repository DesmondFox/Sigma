package com.github.desmondfox.chancore.ui.screens.handler

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.desmondfox.chancore.ACTION_OPEN_MAIN

class ChanRedirectActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        with(Intent(ACTION_OPEN_MAIN)) {
            data = intent.data
            addCategory(Intent.CATEGORY_BROWSABLE)
            putExtras(intent)
            resolveActivity(packageManager)?.let {
                startActivity(this)
            }
            finish()
        }
    }
}