package com.bipin.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var etFirst : EditText
    private lateinit var etSecond : EditText
    private lateinit var btnCalculate : Button
    private lateinit var tvResult: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Reference / binding
        etFirst  = findViewById(R.id.etFirst)
        etSecond  = findViewById(R.id.etSecond)
        btnCalculate  = findViewById(R.id.btnCalculate)
        tvResult = findViewById(R.id.tvResult)

        btnCalculate.setOnClickListener{
           if (validation()){
               retrieveValues()
           }

        }
    }

    private fun validation():Boolean {
        //Validation
        var flag = true;
        if (TextUtils.isEmpty(etFirst.text)){
            etFirst.error = "Please enter a number"
            etFirst.requestFocus()
            flag = false
        }
        else if (TextUtils.isEmpty(etSecond.text)){
            etSecond.error = "Please enter second number"
            etSecond.requestFocus()
            flag = false
        }
        return flag
    }


    private fun retrieveValues(){
        //retrieve values from edit text
        val first : Int = etFirst.text.toString().toInt()
        val second : Int = etSecond.text.toString().toInt()
        addAnother(first,second)
    }

    //function with no return type
    private fun addAnother(first:Int,second:Int){
        val result = first + second
        tvResult.text = result.toString()
    }
}