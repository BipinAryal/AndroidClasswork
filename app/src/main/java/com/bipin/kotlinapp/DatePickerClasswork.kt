package com.bipin.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import java.util.*
import android.app.DatePickerDialog as DatePickerDialog1

class DatePickerClasswork : AppCompatActivity() {

    private lateinit var et1 : EditText
    private lateinit var et2 : EditText
    private lateinit var tv1 : TextView
    private lateinit var tv2 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_picker_classwork)
        et1 = findViewById(R.id.et1)
        et2 = findViewById(R.id.et2)
        tv1 = findViewById(R.id.tv1)
        tv2 = findViewById(R.id.tv2)

      et1.setOnFocusChangeListener { _, _ ->
          LoadCalendardateofjoin()
      }

        et2.setOnFocusChangeListener { _,_ ->
            LoadCalendarDOB()
        }

    }

    private fun LoadCalendardateofjoin(){
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        DatePickerDialog1(
            this,
            DatePickerDialog1.OnDateSetListener {

                    view , yearNew , monthOfYear , dayOfMonth ->
                et1.setText("$dayOfMonth--${monthOfYear + 1}--$yearNew")
                tv1.setText("Number of years worked : ${year - yearNew}")

            },
            year,
            month,
            day
        ).show()
    }

    private fun LoadCalendarDOB(){
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        DatePickerDialog1(
            this,
            DatePickerDialog1.OnDateSetListener {
                view, yearNew , monthOfyear , dayOfMonth ->
                et2.setText("$dayOfMonth--${monthOfyear + 1}--$yearNew")
                tv2.setText("Your age is : ${year - yearNew}")
            },
            year-20,
            month,
            day
        ).show()
    }

}