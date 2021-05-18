package com.example.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val CardView2 = findViewById<CardView>(R.id.CardView2)
        val CardView3 = findViewById<CardView>(R.id.CardView3)

        var Intent : Intent

        CardView2.setOnClickListener {
            intent = Intent(this@MainActivity, ConstellationActivity::class.java)
            startActivity(intent)
        }
        CardView3.setOnClickListener {
            intent = Intent(this@MainActivity, NameActivity::class.java)
            startActivity(intent)
        }
    }
}