package com.example.breathe

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Worried : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_worried)

        val back = findViewById<Button>(R.id.buttonBack)

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