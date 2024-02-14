package com.example.decapodips

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.content.Intent
import android.widget.Button

class SignUpPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_page)

        // link from sign in to sign in page
        val signIntxt = findViewById<TextView>(R.id.loginText)

        signIntxt.setOnClickListener{
            var intent = Intent(this, LogInPage::class.java)
            startActivity(intent)
        }

        // link the sign up button
        val signUpBtn = findViewById<Button>(R.id.signUpBtn)

        signUpBtn.setOnClickListener {
            var intent = Intent(this, EbiKaniWelcome::class.java)
            startActivity(intent)
        }

    }
}