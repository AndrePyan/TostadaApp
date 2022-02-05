package com.example.tostadaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val secondActButton = findViewById<Button>(R.id.button)
        secondActButton.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }

        val thirdActButton = findViewById<Button>(R.id.button2)
        thirdActButton.setOnClickListener {
            startActivity(Intent(this, ThirdActivity::class.java))
        }
        val fourthActButton = findViewById<Button>(R.id.button3)
        fourthActButton.setOnClickListener {
            startActivity(Intent(this, FourthActivity::class.java))
        }
    }
}