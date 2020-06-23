package com.example.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_preobrazov.*

class preobrazov : AppCompatActivity() {

    lateinit var anim: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preobrazov)
        start.setOnClickListener {
        anim = AnimationUtils.loadAnimation(this,R.anim.example_anim)
            start.startAnimation(anim)
        }
    }
}