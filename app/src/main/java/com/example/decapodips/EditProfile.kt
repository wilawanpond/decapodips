package com.example.decapodips

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class EditProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        // Sign out clicking
        val signOutText = findViewById<TextView>(R.id.signOutText)
        signOutText.setOnClickListener{
            var intent = Intent(this, LogInPage::class.java)
            startActivity(intent)
        }

        // back button
        val backBtn = findViewById<ImageView>(R.id.backBtn)
        backBtn.setOnClickListener {
            var intent = Intent(this, Account::class.java)
            startActivity(intent)
        }
    }
}