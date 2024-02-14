package com.example.decapodips

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.content.Intent
import android.net.Uri
import android.widget.Button
import android.widget.ImageView

class SignUpPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_page)

        // link from sign in to sign in page
        val signIntxt = findViewById<TextView>(R.id.loginText)

        signIntxt.setOnClickListener{
            val intent = Intent(this, LogInPage::class.java)
            startActivity(intent)
        }

        // link the sign up button
        val signUpBtn = findViewById<Button>(R.id.signUpBtn)

        signUpBtn.setOnClickListener {
            val intent = Intent(this, EbiKaniWelcome::class.java)
            startActivity(intent)
        }

        // other options for sign up
        // another sign in options (facebook)
        val facebookBtn = findViewById<ImageView>(R.id.facebookBtn)
        facebookBtn.setOnClickListener {
            val url = "https://www.facebook.com/"
            val facebook = Intent(Intent.ACTION_VIEW)
            facebook.setData(Uri.parse(url))
            startActivity(facebook)
        }

        // instagram
        val instagramBtn = findViewById<ImageView>(R.id.instagramBtn)
        instagramBtn.setOnClickListener {
            val url = "https://www.instagram.com/"
            val instagram = Intent(Intent.ACTION_VIEW)
            instagram.setData((Uri.parse(url)))
            startActivity(instagram)
        }

        // email
        val emailBtn = findViewById<ImageView>(R.id.emailBtn)
        emailBtn.setOnClickListener {
            val url = "https://mail.google.com/"
            val email = Intent(Intent.ACTION_VIEW)
            email.setData(Uri.parse(url))
            startActivity(email)
        }


    }
}