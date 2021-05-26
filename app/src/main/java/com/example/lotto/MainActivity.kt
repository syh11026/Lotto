package com.example.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import java.util.*
import kotlin.collections.ArrayList
fun getRandomLottoNumber (): Int{
    return Random().nextInt(45)+1
}
fun getRandomLottoNumbers(): MutableList<Int>{
    val lottoNumbers = mutableListOf<Int>()

    while (true){
        var number: Int = getRandomLottoNumber()
        var flag_existing: Int = 0
  //      for (j in 0..lottoNumbers.size){
        if(lottoNumbers.contains(number)){
  //          if(lottoNumbers[j]?.equals(number)){
   //         if(number.equals(lottoNumbers[j])){
                flag_existing = 1;
                //continue;
            }
        if (flag_existing.equals(1))
            continue
        else
            lottoNumbers.add(number)
        if (lottoNumbers.size>=6)
            break;
    }
    return lottoNumbers
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardRandom = findViewById<CardView>(R.id.cardRandom)
        val cardConstell = findViewById<CardView>(R.id.cardConstell)
        val cardName = findViewById<CardView>(R.id.cardName)

        var Intent : Intent

        cardRandom.setOnClickListener {
            intent = Intent(this@MainActivity, ResultActivity::class.java)
            intent.putIntegerArrayListExtra("result", ArrayList(getRandomLottoNumbers()))
            startActivity(intent)
        }
        cardConstell.setOnClickListener {
            intent = Intent(this@MainActivity, ConstellationActivity::class.java)
            startActivity(intent)
        }
        cardName.setOnClickListener {
            intent = Intent(this@MainActivity, NameActivity::class.java)
            startActivity(intent)
        }
    }

}