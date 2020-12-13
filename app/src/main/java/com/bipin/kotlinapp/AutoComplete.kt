package com.bipin.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Spinner

class AutoComplete : AppCompatActivity() {
    private val languages = arrayListOf("Nepali","Nepali1","Chinese","Chinchung","Japanese","Jangang")
    private lateinit var autoComplete: AutoCompleteTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auto_complete)

        autoComplete = findViewById(R.id.autoComplete)

        //for autocomplete textview

        val autoCompleteAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_dropdown_item_1line,
            languages
        )
        autoComplete.setAdapter(autoCompleteAdapter)
        autoComplete.threshold = 2
    }
}