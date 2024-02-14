package com.example.decapodips

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class Account : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        // from log in
        val editIcon = findViewById<ImageView>(R.id.editIcon)
        editIcon.setOnClickListener {
            var intent = Intent(this, EditProfile::class.java)
            startActivity(intent)
        }

        // when clicking on decapodips badge -> make toast user's rank
        val decapodipsBadge = findViewById<TextView>(R.id.decapodipsBadge)
        decapodipsBadge.setOnClickListener {
            Toast.makeText(this, decapodipsBadge.text, Toast.LENGTH_SHORT).show()
        }

        // To main Activity
        val toHome = findViewById<ImageView>(R.id.homeBtn)
        toHome.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val toUrSauce = findViewById<ImageView>(R.id.sauceBtn)
        toUrSauce.setOnClickListener {
            var intent = Intent(this, CustomizedSauce::class.java)
            startActivity(intent)
        }

        val toFavorite = findViewById<ImageView>(R.id.favoriteBtn)
        toFavorite.setOnClickListener {
            var intent = Intent(this,Favorite::class.java)
            startActivity(intent)
        }
    }
}