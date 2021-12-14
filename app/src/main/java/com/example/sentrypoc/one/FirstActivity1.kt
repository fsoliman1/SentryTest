package com.example.sentrypoc.one

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.sentrypoc.BaseActivity
import com.example.sentrypoc.R
import java.lang.IllegalArgumentException
import java.lang.IllegalStateException

class FirstActivity1 : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        Handler(Looper.getMainLooper()).postDelayed({
            crash3()
        }, 1000)
    }

    fun crash2(): Unit = throw IllegalStateException("Islam should handle this different crash");
    fun crash3(): Unit = throw IllegalArgumentException("Islam should handle this different new crash");
}