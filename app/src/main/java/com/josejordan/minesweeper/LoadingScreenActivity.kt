package com.josejordan.minesweeper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AccelerateInterpolator
import android.widget.ProgressBar
import android.widget.TextView

@Suppress("DEPRECATION")
class LoadingScreenActivity : AppCompatActivity() {
    private val SPLASH_TIME_OUT: Long = 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_Testapp)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading_screen)

            Handler().postDelayed({
            val intent: Intent = Intent(this@LoadingScreenActivity, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_TIME_OUT)
        val t: TextView = findViewById(R.id.textView)
        t.animate().apply {
            rotationY(3000f)
            scaleX(1f)
            duration = 9000
            interpolator = AccelerateInterpolator()
        }.start()
    }
}