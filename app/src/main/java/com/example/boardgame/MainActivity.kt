package com.example.boardgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe1 = findViewById<Button>(R.id.button)
        val btnClickMe2 = findViewById<Button>(R.id.button2)
        val btnClickMe3 = findViewById<Button>(R.id.button3)
        val btnClickMe4 = findViewById<Button>(R.id.button4)
        val btnClickMe5 = findViewById<Button>(R.id.button5)
        val btnClickMe6 = findViewById<Button>(R.id.button6)
        val btnClickMe7 = findViewById<Button>(R.id.button7)
        var homeTextView = findViewById<TextView>(R.id.textView4)
        var awayTextView = findViewById<TextView>(R.id.textView3)
        var homeTimesClicked = 0
        var awayTimesClicked = 0

        btnClickMe1.setOnClickListener {
            homeTimesClicked = homeTimesClicked+1
            homeTextView.text = homeTimesClicked.toString()
            Toast.makeText(this, "Home team gains 1 point!", Toast.LENGTH_SHORT).show()
        }
        btnClickMe2.setOnClickListener {
            homeTimesClicked = homeTimesClicked+2
            homeTextView.text = homeTimesClicked.toString()
            Toast.makeText(this, "Home team gains 2 points!", Toast.LENGTH_SHORT).show()
        }
        btnClickMe3.setOnClickListener {
            homeTimesClicked = homeTimesClicked+3
            homeTextView.text = homeTimesClicked.toString()
            Toast.makeText(this, "Home team gains 3 points!", Toast.LENGTH_SHORT).show()
        }
        btnClickMe4.setOnClickListener {
            awayTimesClicked = awayTimesClicked+1
            awayTextView.text = awayTimesClicked.toString()
            Toast.makeText(this, "Away team gains 1 point!", Toast.LENGTH_SHORT).show()
        }
        btnClickMe5.setOnClickListener {
            awayTimesClicked = awayTimesClicked+2
            awayTextView.text = awayTimesClicked.toString()
            Toast.makeText(this, "Away team gains 2 points!", Toast.LENGTH_SHORT).show()
        }
        btnClickMe6.setOnClickListener {
            awayTimesClicked = awayTimesClicked+3
            awayTextView.text = awayTimesClicked.toString()
            Toast.makeText(this, "Away team gains 3 points!", Toast.LENGTH_SHORT).show()
        }
        btnClickMe7.setOnClickListener {
            homeTimesClicked = 0
            homeTextView.text = homeTimesClicked.toString()
            awayTimesClicked = 0
            awayTextView.text = awayTimesClicked.toString()
            Toast.makeText(this, "SUIIIIIIIIIIIIIIIIII", Toast.LENGTH_LONG).show()
        }

    }
}


