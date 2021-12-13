package com.example.sentrypoc.three

import android.os.Build
import android.os.Bundle
import android.transition.Slide
import android.view.Gravity
import android.view.Window
import com.example.sentrypoc.BaseActivity
import com.example.sentrypoc.R

class TransitionAnimationActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        with(window) {
            requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                exitTransition = Slide(Gravity.LEFT).apply { duration = 2000 }
                enterTransition = Slide(Gravity.RIGHT).apply { duration = 2000 }
            }
        }
        setContentView(R.layout.activity_transition_animation)
    }
}