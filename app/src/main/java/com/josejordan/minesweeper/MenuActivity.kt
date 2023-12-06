package com.josejordan.minesweeper


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.webkit.WebView
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MenuActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var button2: Button
    private lateinit var button3: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        button = findViewById(R.id.button)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button.setOnClickListener {
            val intent: Intent = Intent(this@MenuActivity,MainActivity::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener{
            val intent: Intent = Intent(this@MenuActivity,InformationActivity::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener{
            val intent: Intent = Intent(this@MenuActivity,SettingsActivity::class.java)
            startActivity(intent)
        }
    }
}