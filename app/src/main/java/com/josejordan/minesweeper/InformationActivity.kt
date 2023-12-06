package com.josejordan.minesweeper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

private lateinit var button: Button

class InformationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information)
        button = findViewById(R.id.button4)
        button.setOnClickListener {
            val intent: Intent = Intent(this@InformationActivity, MenuActivity::class.java)
            startActivity(intent)
        }
    }
}