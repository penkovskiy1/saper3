package com.josejordan.minesweeper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val Button: Button = findViewById(R.id.button6)
        Button.setOnClickListener {
            val intent: Intent = Intent(this@MainActivity2, MenuActivity::class.java)
            startActivity(intent)
        }
    }
}