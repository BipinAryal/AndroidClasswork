package com.bipin.kotlinapp

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class AlertActivityClasswork : AppCompatActivity() {

    private lateinit var et1 : EditText
    private lateinit var et2 : EditText
    private lateinit var btn1 : Button

    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_classwork)

        et1 = findViewById(R.id.et1)
        et2 = findViewById(R.id.et2)
        btn1 = findViewById(R.id.btn1)

        btn1.setOnClickListener{
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Calculate")
            builder.setMessage("Are you sure you want to add ?")
            builder.setIcon(android.R.drawable.ic_dialog_alert)
            var add = et1.getText().toString().toInt() + et2.getText().toString().toInt()
            builder.setPositiveButton("Yes"){ _,_ ->
               Toast.makeText(applicationContext,"Result is $add",Toast.LENGTH_LONG).show()
            }
            builder.setNegativeButton("No"){_,_->
                Toast.makeText(applicationContext,"clicked no",Toast.LENGTH_LONG).show()
            }
            val alertDialog : AlertDialog = builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
        }
    }
}