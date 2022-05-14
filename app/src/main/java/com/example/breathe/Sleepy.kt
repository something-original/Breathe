package com.example.breathe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class Sleepy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sleepy)
        val back = findViewById<Button>(R.id.buttonBack)
        val start = findViewById<Button>(R.id.buttonStart)
        val text = findViewById<TextView>(R.id.text)
        var i = 0
        val motion = listOf<Pair<String, Long>>(
            Pair("Вдохните через нос", 2000), Pair("Резко выдохните", 1000),
            Pair("Вдохните через нос", 2000), Pair("Резко выдохните", 1000),
            Pair("Вдохните через нос", 2000), Pair("Резко выдохните", 1000),
            Pair("Вдохните через нос", 2000), Pair("Резко выдохните", 1000),
            Pair("Вдохните через нос", 2000), Pair("Резко выдохните", 1000),
            Pair("Вдохните через нос", 2000), Pair("Резко выдохните", 1000)
        )

        val thread: Thread = object : Thread() {
            override fun run() {
                try {
                    while (!this.isInterrupted) {
                        runOnUiThread {
                            text.text = motion[i].first
                        }
                        sleep(motion[i].second)
                        i++
                    }
                } catch (e: InterruptedException) {
                }
            }
        }

        start.setOnClickListener {
            thread.start()

        }

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