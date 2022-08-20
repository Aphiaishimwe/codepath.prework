package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // show this layout file:activity_main
        setContentView(R.layout.activity_main)

        // Display customized to show 'Hello from Aphia'
        // user can tap a button to change the text color of the label
        // 1. add a button to layout

        // get a reference to a button

        // 2. set up a logic to know when a user has tapped n the button
        findViewById<Button>(R.id.button3).setOnClickListener{
            // handle button tap
            // change the text color
            Log.i("Aphia", "tapped on button")
            // 1. get a reference to a text view
            // 2. set the color of the text view
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))


        }
        // 3. change the color of a text
    }
}