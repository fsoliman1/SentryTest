package com.example.sentrypoc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager


class TransparentActivity : BaseActivity() {

    private var createTime: Long = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        createTime = System.currentTimeMillis()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transparent)
        window.addFlags(
            WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE
                    or WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL
                    or WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE
        )
    }

    override fun onStart() {
        super.onStart()
    }
}