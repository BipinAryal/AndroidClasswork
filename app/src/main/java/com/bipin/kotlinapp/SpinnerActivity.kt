package com.bipin.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class SpinnerActivity : AppCompatActivity() {

    private val languages = arrayOf("Nepali","Hindi","Urdu","japan","Chinese")
    private lateinit var spinner : Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)

        spinner = findViewById(R.id.spinner)
        //Array adapter
        val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                languages
        )
        spinner.adapter = adapter

        //on item selected listener on spinner

        spinner.onItemSelectedListener =
                object : AdapterView.OnItemSelectedListener{
                    override fun onItemSelected(parent: AdapterView<*>?,
                                                view: View?,
                                                position: Int,
                                                id: Long
                    ) {
                        val selectedItem = parent?.getItemAtPosition(position).toString()
                        Toast.makeText(
                                applicationContext, "Selected item : $selectedItem",
                                Toast.LENGTH_SHORT
                        ).show()


                    }

                    override fun onNothingSelected(parent: AdapterView<*>?) {

                    }
                }
    }

}