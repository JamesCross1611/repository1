package com.example.animation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      kadr.setOnClickListener {
          val randomIntent = Intent(this,pokadr::class.java)
          startActivity(randomIntent)
      }
        preo.setOnClickListener {
            val randomIntent = Intent(this,preobrazov::class.java)
            startActivity(randomIntent)
        }
    }
}