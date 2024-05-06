package com.example.assignment2game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val welcome = findViewById<TextView>(R.id.textView)
        //declaring the button variable
        val button = findViewById<Button>(R.id.button)

        //Listener that goes to the next page
        button?.setOnClickListener {
            //create the explicit intent
            val intent = Intent(this,MainActivity2::class.java)
            //Starting the activity
            startActivity(intent)

        }
    }
}