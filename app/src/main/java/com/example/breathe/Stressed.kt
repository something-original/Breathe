package com.example.breathe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import logic.printText

class Stressed : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stressed)
        val back = findViewById<Button>(R.id.buttonBack)
        val start = findViewById<Button>(R.id.buttonStart)
        val text = findViewById<TextView>(R.id.text)
        start.setOnClickListener {
            printText("stress", text)
        }

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