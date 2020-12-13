package com.bipin.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton

class ImageActivity : AppCompatActivity() {
    private lateinit var rdbSaitama : RadioButton
    private lateinit var rdbLuffy : RadioButton
    private lateinit var rdbNaruto : RadioButton
    private lateinit var imgProfile : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        rdbLuffy  = findViewById(R.id.rdbLuffy)
        rdbNaruto  = findViewById(R.id.rdbNaruto)
        rdbSaitama = findViewById(R.id.rdbSaitama)
        imgProfile = findViewById(R.id.imgProfile)

        rdbLuffy.setOnClickListener{
            imgProfile.setImageResource(R.drawable.luffy)
        }

        rdbNaruto.setOnClickListener{
            imgProfile.setImageResource(R.drawable.naruto)
        }

        rdbSaitama.setOnClickListener{
            imgProfile.setImageResource(R.drawable.saitama)
        }
    }
}