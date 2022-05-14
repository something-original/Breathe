package com.example.breathe

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import logic.printText

class Worried : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_worried)
        val back = findViewById<Button>(R.id.buttonBack)
        val start = findViewById<Button>(R.id.buttonStart)
        val text = findViewById<TextView>(R.id.text)
        start.setOnClickListener {
            printText("worried", text)
        }

        back.setOnClickListener {
            startActivity(
                Intent(
                    this@Worried,
                    MainActivity::class.java
                )
            )
        }
    }
}