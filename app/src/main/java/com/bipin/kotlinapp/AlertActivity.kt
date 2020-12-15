package com.bipin.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class AlertActivity : AppCompatActivity() {
    private lateinit var btn1 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert)
        btn1 = findViewById(R.id.btn1)

        btn1.setOnClickListener{
            val builder = AlertDialog.Builder(this)
            builder.setTitle("My Alert")
            builder.setMessage("Are you sure you want to delete ?")
            builder.setIcon(android.R.drawable.ic_dialog_alert)
            builder.setPositiveButton("Yes"){ _,_ ->
                Toast.makeText(applicationContext,"clicked yes",Toast.LENGTH_LONG).show()
            }
            builder.setNeutralButton("Cancel"){_,_ ->
                Toast.makeText(applicationContext,"clicked cancel",
                        Toast.LENGTH_LONG).show()
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