package com.example.sentrypoc.one

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.sentrypoc.BaseActivity
import com.example.sentrypoc.R
import java.lang.ArithmeticException
import java.lang.IllegalArgumentException
import java.lang.IllegalStateException
import java.lang.NumberFormatException
import java.lang.RuntimeException

class FirstActivity1 : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        Handler(Looper.getMainLooper()).postDelayed({
            crash6()
        }, 1000)
    }

    fun crash2(): Unit = throw IllegalStateException("Islam should handle this different crash");
    fun crash3(): Unit = throw IllegalArgumentException("Islam should handle this different new crash");
    fun crash4(): Unit = throw IllegalThreadStateException("Islam should handle this different brand new crash");
    fun crash5(): Unit = throw NumberFormatException("Islam should handle this different brand new second crash");
    fun crash6(): Unit = throw ArithmeticException("Islam should handle this different brand new second crash");
}