package com.example.sentrypoc

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity: AppCompatActivity() {

    private var creationTime: Long? = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        creationTime = System.currentTimeMillis()
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        val now = System.currentTimeMillis()
        creationTime?.let {
            Log.d("APPDBGT", "${this.localClassName}\tmanual cold time: ${now - it}")
            creationTime = null
        }
    }
}