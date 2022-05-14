package com.example.breathe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Stressed : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stressed)
        val back = findViewById<Button>(R.id.buttonBack)

        back.setOnClickListener {
            startActivity(
                Intent(
                    this@Stressed,
                    MainActivity::class.java
                )
            )
        }
    }
}