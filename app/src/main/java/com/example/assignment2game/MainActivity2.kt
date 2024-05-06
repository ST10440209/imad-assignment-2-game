package com.example.assignment2game

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        //declaring the variables
        val buttonfeed = findViewById<Button>(R.id.button2)
        val buttonclean = findViewById<Button>(R.id.button3)
        val buttonplay = findViewById<Button>(R.id.button5)
        val image = findViewById<ImageView>(R.id.imageView)
        val hungertext =findViewById<TextView>(R.id.textView5)
        val cleantext = findViewById<TextView>(R.id.textView6)
        val happytext = findViewById<TextView>(R.id.textView7)
        val instruction = findViewById<TextView>(R.id.textView8)

        val hungrycat = 8
        var cleancat= 5
        var happycat= 3


        //by declaring each of these buttons it will make each of the images appear every
        //time the user clicks on the buttons
        buttonclean?.setOnClickListener {
            image.setImageResource(R.drawable.cat_bathing)

            }

            buttonfeed?.setOnClickListener {
                image.setImageResource(R.drawable.assi1_pic_eating)
                if (hungrycat>10) {
                    hungertext.text = "Full,Cant eat anymore"
                }
                else if (cleancat<=0) {
                    cleantext.text= "Dirty"
                }
                else if (happycat<=0){
                    happytext.text= "Depressed"
                }

                buttonplay?.setOnClickListener {
                    image.setImageResource(R.drawable.cat_playing)
                    if (happycat>10) {
                        happytext.text= "Happy.cant play anymore"
                    }
                    else if (cleancat<=0){
                        cleantext.text="Dirty"
                    }
                    else if (happycat<=0){
                        happytext.text="Depressed"
                    }


                    buttonfeed?.setOnClickListener {

                        val hunger = hungertext.text.toString().toInt() + 2
                        hungertext.text = hunger.toString()

                        val clean = cleantext.text.toString().toInt() - 2
                        cleantext.text = clean.toString()

                        val happy = happytext.text.toString().toInt() - 1
                        happytext.text = happy.toString()
                    }

                    buttonplay?.setOnClickListener {

                        val hungertwo = hungertext.text.toString().toInt() - 2
                        hungertext.text = hungertwo.toString()

                        val cleantwo = cleantext.text.toString().toInt() - 3
                        cleantext.text = cleantwo.toString()

                        val happytwo = happytext.text.toString().toInt() + 4
                        happytext.text = happytwo.toString()

                    }
                    buttonclean?.setOnClickListener {

                        val hungerthree = hungertext.text.toString().toInt() - 3
                        hungertext.text = hungerthree.toString()

                        val cleanthree = cleantext.text.toString().toInt() + 4
                        cleantext.text = cleanthree.toString()

                        val happythree = happytext.text.toString().toInt() - 1
                        happytext.text = happythree.toString()
                    }
                }
            }
        }
    }












