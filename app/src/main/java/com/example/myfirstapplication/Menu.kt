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
private lateinit var mcnuggets: ImageButton

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        bigMac()
        mcFries()
        mcCoke()
        mcIceCream()
        mcWater()
        mcNuggets()
    }

    //when the user clicks on the bigMac image -
    // it opens a dialog that shows the item's details
    private fun bigMac() {
        bigmac = findViewById(R.id.bigMac)
        bigmac.setOnClickListener {
            var builder = Dialog(this)
            builder.requestWindowFeature(Window.FEATURE_NO_TITLE)
            builder.setContentView(R.layout.bigmac)
            builder.setCancelable(false)

            //when the user clicks on the 'X' button it closes the dialog and returns to the previous layer
            builder.findViewById<Button>(R.id.xbutton).setOnClickListener {
                builder.dismiss()
            }
            builder.show()

        }
    }
    //when the user clicks on the Mcfries image -
    // it opens a dialog that shows the item's details
    private fun mcFries() {
        mcfries = findViewById(R.id.fries)
        mcfries.setOnClickListener {
            var builder = Dialog(this)
            builder.requestWindowFeature(Window.FEATURE_NO_TITLE)
            builder.setContentView(R.layout.fries)
            builder.setCancelable(false)

            //when the user clicks on the 'X' button it closes the dialog and returns to the previous layer
            builder.findViewById<Button>(R.id.xfriesbutton).setOnClickListener {
                builder.dismiss()
            }
            builder.show()
        }
    }

    //when the user clicks on the coke image
    // it opens a dialog that shows the item's details
    private fun mcCoke() {
        coke = findViewById(R.id.coke)
        coke.setOnClickListener {
            var builder = Dialog(this)
            builder.requestWindowFeature(Window.FEATURE_NO_TITLE)
            builder.setContentView(R.layout.drink)
            builder.setCancelable(false)

            //when the user clicks on the 'X' button it closes the dialog and returns to the previous layer
            builder.findViewById<Button>(R.id.xdrinkbutton).setOnClickListener {
                builder.dismiss()
            }
            builder.show()
        }
    }

    //when the user clicks on the ice cream image
    // it opens a dialog that shows the item's details
    private fun mcIceCream() {
        icecream = findViewById(R.id.icecream)
        icecream.setOnClickListener {
            var builder = Dialog(this)
            builder.requestWindowFeature(Window.FEATURE_NO_TITLE)
            builder.setContentView(R.layout.icecream)
            builder.setCancelable(false)

            //when the user clicks on the 'X' button it closes the dialog and returns to the previous layer
            builder.findViewById<Button>(R.id.xicebutton).setOnClickListener {
                builder.dismiss()
            }
            builder.show()
        }
    }

    //when the user clicks on the water image -
    // it opens a dialog that shows the item's details
    private fun mcWater() {
        water = findViewById(R.id.water)
        water.setOnClickListener {
            var builder = Dialog(this)
            builder.requestWindowFeature(Window.FEATURE_NO_TITLE)
            builder.setContentView(R.layout.water)
            builder.setCancelable(false)

            //when the user clicks on the 'X' button it closes the dialog and returns to the previous layer
            builder.findViewById<Button>(R.id.xwaterbutton).setOnClickListener {
                builder.dismiss()
            }
            builder.show()
        }
    }

        //when the user clicks on the McNuggets image -
        // it opens a dialog that shows the item's details
        private fun mcNuggets() {
            mcnuggets = findViewById(R.id.nuggets)
            mcnuggets.setOnClickListener {
                var builder = Dialog(this)
                builder.requestWindowFeature(Window.FEATURE_NO_TITLE)
                builder.setContentView(R.layout.nuggets)
                builder.setCancelable(false)

                //when the user clicks on the 'X' button it closes the dialog and returns to the previous layer
                builder.findViewById<Button>(R.id.xnuggetsbutton).setOnClickListener {
                    builder.dismiss()
                }
                builder.show()
            }
        }

    }
