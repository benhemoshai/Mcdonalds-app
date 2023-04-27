package com.example.myfirstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val slideInAnim = AnimationUtils.loadAnimation(
        applicationContext,
        R.anim.slide_in)

        //when the user clicks on the "menu" button
        val menu_button = findViewById<Button>(R.id.menuButton)
        val reservation_button = findViewById<Button>(R.id.reservationButton)

        menu_button.setOnClickListener{
            val intent = Intent(this,Menu::class.java)
            startActivity(intent)
           // menu_button.startAnimation(slideInAnim)


        }
        //when the user clicks on the "reserve seats" button
            reservation_button.setOnClickListener{
            val intent = Intent(this,ReservationActivity::class.java)
            startActivity(intent)
            //reservation_button.startAnimation(slideInAnim)




            }

    }

}