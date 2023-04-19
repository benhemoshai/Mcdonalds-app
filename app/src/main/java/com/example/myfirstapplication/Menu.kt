package com.example.myfirstapplication

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.ImageButton

private lateinit var bigmac: ImageButton
private lateinit var mcfries: ImageButton
private lateinit var coke: ImageButton
private lateinit var icecream: ImageButton
private lateinit var water: ImageButton

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        bigMac()
        mcFries()
        mcCoke()
        mcIceCream()
        mcWater()
    }

    private fun bigMac() {
        //when the user clicks on the bigMac image
        bigmac = findViewById(R.id.bigMac)
        bigmac.setOnClickListener {
            var builder = Dialog(this)
            builder.requestWindowFeature(Window.FEATURE_NO_TITLE)
            builder.setContentView(R.layout.bigmac)
            builder.setCancelable(false)
            builder.findViewById<Button>(R.id.xbutton).setOnClickListener {
                builder.dismiss()
            }
            builder.show()
        }
    }

    private fun mcFries() {
        //when the user clicks on the Mcfries image
        mcfries = findViewById(R.id.fries)
        mcfries.setOnClickListener {
            var builder = Dialog(this)
            builder.requestWindowFeature(Window.FEATURE_NO_TITLE)
            builder.setContentView(R.layout.fries)
            builder.setCancelable(false)

            builder.findViewById<Button>(R.id.xfriesbutton).setOnClickListener {
                builder.dismiss()
            }
            builder.show()
        }
    }

    private fun mcCoke() {
        //when the user clicks on the drink image
        coke = findViewById(R.id.coke)
        coke.setOnClickListener {
            var builder = Dialog(this)
            builder.requestWindowFeature(Window.FEATURE_NO_TITLE)
            builder.setContentView(R.layout.drink)
            builder.setCancelable(false)

            builder.findViewById<Button>(R.id.xdrinkbutton).setOnClickListener {
                builder.dismiss()
            }
            builder.show()
        }
    }

    private fun mcIceCream() {
        //when the user clicks on the ice cream image
        icecream = findViewById(R.id.icecream)
        icecream.setOnClickListener {
            var builder = Dialog(this)
            builder.requestWindowFeature(Window.FEATURE_NO_TITLE)
            builder.setContentView(R.layout.icecream)
            builder.setCancelable(false)

            builder.findViewById<Button>(R.id.xicebutton).setOnClickListener {
                builder.dismiss()
            }
            builder.show()
        }
    }

    private fun mcWater() {
        water = findViewById(R.id.water)
        water.setOnClickListener {
            var builder = Dialog(this)
            builder.requestWindowFeature(Window.FEATURE_NO_TITLE)
            builder.setContentView(R.layout.water)
            builder.setCancelable(false)

            builder.findViewById<Button>(R.id.xwaterbutton).setOnClickListener {
                builder.dismiss()
            }
            builder.show()
        }


    }
}