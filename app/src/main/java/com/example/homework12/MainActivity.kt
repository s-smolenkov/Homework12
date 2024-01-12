package com.example.homework12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val flSendButton : FrameLayout = findViewById(R.id.flSendButton)
        flSendButton.setOnClickListener{
            Toast.makeText(
                this,
                "sending...",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}