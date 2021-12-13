package com.example.sentrypoc

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.sentrypoc.one.FirstActivity1
import com.example.sentrypoc.three.TransitionAnimationActivity
import com.example.sentrypoc.two.HeavyActivity
import java.lang.RuntimeException

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.firstButton).setOnClickListener {
            startActivity(Intent(this@MainActivity, FirstActivity1::class.java))

        }
        findViewById<View>(R.id.secondButton).setOnClickListener {
            startActivity(
                Intent(this@MainActivity, TransitionAnimationActivity::class.java),
                ActivityOptions.makeSceneTransitionAnimation(this).toBundle()
            )
        }
        findViewById<View>(R.id.thirdButton).setOnClickListener {
            startActivity(Intent(this@MainActivity, HeavyActivity::class.java))
        }
        findViewById<View>(R.id.forthButton).setOnClickListener {
            crash()
            //startActivity(Intent(this@MainActivity, TransparentActivity::class.java))
        }
        findViewById<View>(R.id.fifthButton).setOnClickListener {
            val startMain = Intent(Intent.ACTION_MAIN)
            startMain.addCategory(Intent.CATEGORY_HOME)
            startMain.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(startMain)
            Handler().postDelayed({
                startActivity(
                    Intent(
                        this@MainActivity,
                        DelayedActivity::class.java
                    )
                )
            }, 5000)
        }
    }

    private fun crash(): Unit = throw RuntimeException("integration test")
}