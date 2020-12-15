package com.bipin.kotlinapp

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.util.*

class DatePickerActivity : AppCompatActivity() {

    private lateinit var btnLoadCalendar : Button
    private lateinit var tvDate : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_picker)

        btnLoadCalendar = findViewById(R.id.btnLoadCalendar)
        tvDate = findViewById(R.id.tvDate)

    }

    private fun LoadCalendar(){
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener {

                    view , yearNew , monthOfYear , dayOfMonth ->
                tvDate.text = "$dayOfMonth-${monthOfYear + 1} -$yearNew"

            },
            year,
            month,
            day
        ).show()
//        commene hrere
    }
}
