package com.example.decapodips

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class EditProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        // Sign out clicking
        val signOutText = findViewById<TextView>(R.id.signOutText)
        signOutText.setOnClickListener{
            val intent = Intent(this, LogInPage::class.java)
            startActivity(intent)
        }

        // back button
        val backBtn = findViewById<ImageView>(R.id.backBtn)
        backBtn.setOnClickListener {
            val intent = Intent(this, Account::class.java)
            startActivity(intent)
        }
    }
}