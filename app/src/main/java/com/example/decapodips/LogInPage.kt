package com.example.decapodips

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class LogInPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in_page)

        // link register text
        val signUptxt = findViewById<TextView>(R.id.loginText)

        signUptxt.setOnClickListener{
            val intent = Intent(this, SignUpPage::class.java)
            startActivity(intent)
        }

//      link the login button
        val loginBtn = findViewById<Button>(R.id.loginBtn)

        loginBtn.setOnClickListener {
            val message: String = findViewById<EditText>(R.id.showMessageTxt).text.toString()
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("login_username", message)
            startActivity(intent)
        }

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