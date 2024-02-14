package com.example.decapodips

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WelcomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_page)

        // Sign in button
        val signInBtn = findViewById<Button>(R.id.signInBtn)

        signInBtn.setOnClickListener {
            var intent = Intent(this,LogInPage::class.java)
            startActivity(intent)
        }

        val signUpBtn = findViewById<Button>(R.id.signUpBtn)

        signUpBtn.setOnClickListener {
            var intent = Intent(this, SignUpPage::class.java)
            startActivity(intent)
        }
    }

}