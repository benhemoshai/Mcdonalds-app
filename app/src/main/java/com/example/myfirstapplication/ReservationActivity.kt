package com.example.myfirstapplication

import android.app.AlertDialog
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.util.*

private lateinit var builder : AlertDialog.Builder
private lateinit var showDate: TextView
private var numOfPeople = 0

class ReservationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reservation)
        setDateAndTime()
        setPeopleAmount()
        submit()
    }

    private fun setDateAndTime() {
        //date&time pickers - initializes the year,month,day and the time
        showDate = findViewById(R.id.show_date2)
        val datetimePicker =
            DatePickerDialog.OnDateSetListener { _, year, monthOfYear, dayOfMonth ->
                val timePicker = TimePickerDialog.OnTimeSetListener { _, hourOfDay, minute ->
                    val selectedDateTime = Calendar.getInstance()
                    selectedDateTime.set(Calendar.YEAR, year)
                    selectedDateTime.set(Calendar.MONTH, monthOfYear)
                    selectedDateTime.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                    selectedDateTime.set(Calendar.HOUR_OF_DAY, hourOfDay)
                    selectedDateTime.set(Calendar.MINUTE, minute)

                    val selectedDate = "$dayOfMonth/${monthOfYear + 1}/$year"
                    val selectedTime = "${hourOfDay.toString().padStart(2, '0')}:${
                        minute.toString().padStart(2, '0')
                    }"

                    // saves selectedDate and selectedTime into a textbox
                    showDate.text = "$selectedDate $selectedTime"
                }
                //shows the time picker
                val calendar = Calendar.getInstance()
                val hour = calendar.get(Calendar.HOUR_OF_DAY)
                val minute = calendar.get(Calendar.MINUTE)

                TimePickerDialog(this, timePicker, hour, minute, true).show()
            }
        //shows the date picker
        val buttonDateTimePicker = findViewById<Button>(R.id.date1)
        buttonDateTimePicker.setOnClickListener {
            val calendar = Calendar.getInstance()
            val year = calendar.get(Calendar.YEAR)
            val month = calendar.get(Calendar.MONTH)
            val day = calendar.get(Calendar.DAY_OF_MONTH)

            DatePickerDialog(this, datetimePicker, year, month, day).show()
        }
    }
    private fun setPeopleAmount(){
        //changes the amount of people
        val plusButton = findViewById<Button>(R.id.button2)
        val people = findViewById<TextView>(R.id.people)
        plusButton.setOnClickListener {
            numOfPeople++
            people.text = numOfPeople.toString()
        }
        val minusButton = findViewById<Button>(R.id.button4)
        minusButton.setOnClickListener {
            if (numOfPeople > 0) {
                numOfPeople--
                people.text = numOfPeople.toString()
            }
        }
    }

    private fun submit(){
            //payment method radioButtons
            val payment = findViewById<RadioGroup>(R.id.radioGroup)
            //submitting message with all the reservation details
            val submitButton = findViewById<Button>(R.id.submit)
            builder = AlertDialog.Builder(this)

        ///submit button
            submitButton.setOnClickListener {

                val selectID = payment.checkedRadioButtonId
                val btn = findViewById<RadioButton>(selectID)

                //checks if the user entered the whole fields before hitting the submit button
                if (selectID==-1) Toast.makeText(this@ReservationActivity , "Select a payment method",Toast.LENGTH_LONG).show()
                else if (numOfPeople==0) Toast.makeText(this@ReservationActivity , "Select the amount of people",Toast.LENGTH_LONG).show()
                else if (showDate.text == "")  Toast.makeText(this@ReservationActivity , "Select the date&time",Toast.LENGTH_LONG).show()
                else {
                    val isVegan = findViewById<CheckBox>(R.id.isVegan)
                    val selectBox = isVegan.isChecked
                    var vegan = ""
                    //checks if the user marked the vegan checkbox
                    if (selectBox) vegan = "is a vegan guest"
                    else vegan = "is not a vegan guest"

                    builder.setTitle("Great!")
                        .setMessage(
                            "These are the reservation details :\n" +

                                    " A table for $numOfPeople in ${showDate.text}\n" +
                                    "The payment method is : ${btn.text} \n" +
                                    "and there $vegan"

                        )

                        //when the user clicks on "OK" he is being transferred to the main page
                        .setPositiveButton("Ok") { dialogInterface, it ->
                            val intent = Intent(this, MainActivity::class.java)
                            startActivity(intent)
                        }
                        .show()
                }

            }

        }

    }
