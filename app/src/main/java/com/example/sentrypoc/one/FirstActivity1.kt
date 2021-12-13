package com.example.sentrypoc.one

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.sentrypoc.BaseActivity
import com.example.sentrypoc.R
import java.lang.RuntimeException

class FirstActivity1 : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        Handler(Looper.getMainLooper()).postDelayed({
            throw RuntimeException("Islam should handle this crash!!")
        }, 1000)
    }
}