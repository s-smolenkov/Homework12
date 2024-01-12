package com.example.homework12

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.EditText
import android.widget.FrameLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val flSendButton: FrameLayout = findViewById(R.id.flSendButton)
        val emailFiled: EditText = findViewById(R.id.email)
        val subjectFiled: EditText = findViewById(R.id.subject)
        val messageFiled: EditText = findViewById(R.id.message)

        flSendButton.setOnClickListener {
            val email = emailFiled.text.toString()
            val subject = subjectFiled.text.toString()
            val message = messageFiled.text.toString()
            sendEmail(email, subject, message)
        }
    }

    private fun sendEmail(email: String, subject: String, message: String) {
        val intent = Intent(Intent.ACTION_SEND).apply {
            type = "text/plain"
            putExtra(Intent.EXTRA_EMAIL, arrayOf(email))
            putExtra(Intent.EXTRA_SUBJECT, subject)
            putExtra(Intent.EXTRA_TEXT, message)
        }
        startActivity(Intent.createChooser(intent, "Choose an Email client"))
    }
}