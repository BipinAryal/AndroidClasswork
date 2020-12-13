package com.bipin.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.security.Principal

class SiActivity : AppCompatActivity() {
    private lateinit var etPrincipal: EditText
    private lateinit var etTime : EditText
    private lateinit var etRate : EditText
    private lateinit var btnCalc : Button
    private lateinit var tvResult: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_si)

        etPrincipal = findViewById(R.id.etPrincipal)
        etTime  = findViewById(R.id.etTime)
        etRate  = findViewById(R.id.etRate)
        btnCalc  = findViewById(R.id.btnCalc)
        tvResult = findViewById(R.id.tvResult)

        btnCalc.setOnClickListener{
        if (validation()){
            retrieveValues()
        }
        }
    }

    private fun validation(): Boolean {
        var flag = true;
        if (TextUtils.isEmpty(etPrincipal.text)) {
            etPrincipal.error = "Please enter a number"
            etPrincipal.requestFocus()
            flag = false
        } else if (TextUtils.isEmpty(etRate.text)) {
            etRate.error = "Please enter second number"
            etRate.requestFocus()
            flag = false
        } else if (TextUtils.isEmpty(etTime.text)) {
            etTime.error = "Please enter second number"
            etTime.requestFocus()
            flag = false

        }
        return flag
    }


        private fun retrieveValues() {
            val principal: Int = etPrincipal.text.toString().toInt()
            val time: Int = etTime.text.toString().toInt()
            val rate: Int = etRate.text.toString().toInt()
            SimpleIntrest(principal, time, rate)
        }

        private fun SimpleIntrest(principal: Int, time: Int, rate: Int) {
            val simpleintrest = principal * time * rate / 100
            tvResult.text = simpleintrest.toString()
        }

}


