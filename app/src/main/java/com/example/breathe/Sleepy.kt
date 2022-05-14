package com.example.breathe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Sleepy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sleepy)

        val back = findViewById<Button>(R.id.buttonBack)

        back.setOnClickListener {
            startActivity(
                Intent(
                    this@Sleepy,
                    MainActivity::class.java
                )
            )
        }
    }
}