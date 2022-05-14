package com.example.breathe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import logic.printText


class PanicAttack : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_panic_attack)
        val back = findViewById<Button>(R.id.buttonBack)
        val start = findViewById<Button>(R.id.buttonStart)
        val text = findViewById<TextView>(R.id.text)
        start.setOnClickListener {
            printText("panicAttack", text)
        }

        back.setOnClickListener {
            startActivity(
                Intent(
                    this@PanicAttack,
                    MainActivity::class.java
                )
            )
        }
    }

}