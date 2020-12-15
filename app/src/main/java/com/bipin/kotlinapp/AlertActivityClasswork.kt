package com.bipin.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class AlertActivityClasswork : AppCompatActivity() {
    private lateinit var et1 : EditText
    private lateinit var et2 : EditText
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_classwork)
    }
}