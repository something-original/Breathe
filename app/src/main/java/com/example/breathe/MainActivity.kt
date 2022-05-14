package com.example.breathe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val panicAttack = findViewById<Button>(R.id.buttonPanicAttack)
        val worried = findViewById<Button>(R.id.buttonWorried)
        val sleepy = findViewById<Button>(R.id.buttonSleepy)
        val stressed = findViewById<Button>(R.id.buttonStress)
        val angry = findViewById<Button>(R.id.buttonAngry)

        panicAttack.setOnClickListener {
            startActivity(
                Intent(
                    this@MainActivity,
                    PanicAttack::class.java
                )
            )
        }

        worried.setOnClickListener {
            startActivity(
                Intent(
                    this@MainActivity,
                    Worried::class.java
                )
            )
        }

        sleepy.setOnClickListener {
            startActivity(
                Intent(
                    this@MainActivity,
                    Sleepy::class.java
                )
            )
        }

        stressed.setOnClickListener {
            startActivity(
                Intent(
                    this@MainActivity,
                    Stressed::class.java
                )
            )
        }

        angry.setOnClickListener {
            startActivity(
                Intent(
                    this@MainActivity,
                    Angry::class.java
                )
            )
        }
    }

}