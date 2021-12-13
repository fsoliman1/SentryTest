package com.example.sentrypoc.two

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.sentrypoc.BaseActivity
import com.example.sentrypoc.R
import java.lang.RuntimeException

class HeavyActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_heavy)
        Handler(Looper.getMainLooper()).postDelayed({
            throw RuntimeException("Islam should not handle this crash")
        }, 1000)
    }
}