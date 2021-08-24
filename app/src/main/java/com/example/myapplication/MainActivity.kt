package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image: ImageView = findViewById(R.id.imageView)
        val butss: Button = findViewById(R.id.button3)
        val bbb : View = findViewById(R.id.constraints)



        butss.setOnClickListener {
            image.visibility = View.VISIBLE

            bbb.setBackgroundColor(getColor(R.color.white))
        }


    }
}