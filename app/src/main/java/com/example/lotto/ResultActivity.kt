package com.example.lotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        // 1) get result
        val result = intent.getIntArrayExtra("result")//?: return
        val strConstellation = intent.getStringExtra("constellation")

        // 2) sort the array
        //result.sort()
       // val result_sorted = result?.sorted()
         val result_sorted = result?.let { result.sortedBy{it}}
        /* result?.let{
        updateLottoBallImages(result.sortedBy { it })
        }*/


        // 3) set images
        strConstellation?.let {
            val resultLabel = findViewById<TextView>(R.id.resultLabel)
            resultLabel.text = "${strConstellation}의 ${SimpleDateFormat("yyyy년 MM월dd일 ").format(Date())} 로또입니다."
        }
         result?.let{
        updateLottoBallImages(result.sortedBy { it })
        }
     //   val lottoBallImageStartId = R.drawable.ball_01
       // val lottoBallImageId2 = R.drawable.ball_02
       // val lottoBallImageId3 = R.drawable.ball_03
       /* val imageView1 = findViewById<ImageView>(R.id.imageView1)
        val imageView2 = findViewById<ImageView>(R.id.imageView2)
        val imageView3 = findViewById<ImageView>(R.id.imageView3)
        val imageView4 = findViewById<ImageView>(R.id.imageView4)
        val imageView5 = findViewById<ImageView>(R.id.imageView5)

            val imageView6 = findViewById<ImageView>(R.id.imageView6) val lottoBallImageStartId = R.drawable.ball_01

        imageView1.setImageResource(lottoBallImageStartId + result_sorted!![0] -1)
        imageView2.setImageResource(lottoBallImageStartId + result_sorted[1] -1)
        imageView3.setImageResource(lottoBallImageStartId + result_sorted[2] -1)
        imageView4.setImageResource(lottoBallImageStartId + result_sorted[3] -1)
        imageView5.setImageResource(lottoBallImageStartId + result_sorted[4] -1)
        imageView6.setImageResource(lottoBallImageStartId + result_sorted[5] -1)*/

    }

    private fun updateLottoBallImages(result_sorted : List<Int>){
        val lottoBallImageStartId = R.drawable.ball_01

        val imageView1 = findViewById<ImageView>(R.id.imageView1)
        val imageView2 = findViewById<ImageView>(R.id.imageView2)
        val imageView3 = findViewById<ImageView>(R.id.imageView3)
        val imageView4 = findViewById<ImageView>(R.id.imageView4)
        val imageView5 = findViewById<ImageView>(R.id.imageView5)
        val imageView6 = findViewById<ImageView>(R.id.imageView6)

        imageView1.setImageResource(lottoBallImageStartId + result_sorted!![0] -1)
        imageView2.setImageResource(lottoBallImageStartId + result_sorted[1] -1)
        imageView3.setImageResource(lottoBallImageStartId + result_sorted[2] -1)
        imageView4.setImageResource(lottoBallImageStartId + result_sorted[3] -1)
        imageView5.setImageResource(lottoBallImageStartId + result_sorted[4] -1)
        imageView6.setImageResource(lottoBallImageStartId + result_sorted[5] -1)

    }
}