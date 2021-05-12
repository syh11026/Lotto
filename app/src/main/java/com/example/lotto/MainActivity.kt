package com.example.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val CardView = findViewById<CardView>(R.id.CardView2)

        var Intent : Intent

        CardView.setOnClickListener {
            intent = Intent(this@MainActivity, ConstellationActivity::class.java)
            startActivity(intent)
        }

    }
}