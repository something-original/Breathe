package com.example.breathe

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.breathe.databinding.ActivityPanicAttackBinding
import logic.LogicBreathe

class PanicAttack : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_panic_attack)
        val back = findViewById<Button>(R.id.buttonBack)
        val start = findViewById<Button>(R.id.buttonStart)

        start.setOnClickListener {
            LogicBreathe.printText("panicAttack")
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