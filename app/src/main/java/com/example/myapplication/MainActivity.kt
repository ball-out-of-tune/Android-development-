package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //var counters = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val but = findViewById<Button>(R.id.button)
//        var counters = 0
//        but.setOnClickListener {
//            counters++
//            but.text = counters.toString()
//        }
        var isBlue = 0
        fun transfer(){
            if (isBlue == 0) {
                but.setTextColor(Color.RED)
                isBlue = 1
            } else {
                but.setTextColor(Color.BLUE)
                isBlue = 0
            }
        }
        but.setOnClickListener { transfer() }
    }

}