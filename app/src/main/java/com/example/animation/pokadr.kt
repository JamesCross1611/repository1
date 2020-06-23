package com.example.animation

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pokadr.*

class pokadr : AppCompatActivity() {

    lateinit var anim: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokadr)
        (image_id.background as AnimationDrawable).start()
    }
}