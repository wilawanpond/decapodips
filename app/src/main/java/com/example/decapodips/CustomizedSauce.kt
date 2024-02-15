package com.example.decapodips

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class CustomizedSauce : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customized_sauce)

        // saved icon clicked
        val savedIcon = findViewById<ImageView>(R.id.savedIcon)
        savedIcon.setOnClickListener {
            val intent = Intent(this, SavedSauce::class.java)
            startActivity(intent)
        }

        // to Main Activity
        val toHome = findViewById<ImageView>(R.id.homeBtn)
        toHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        // to Account page
        val toAccount = findViewById<ImageView>(R.id.accountBtn)
        toAccount.setOnClickListener {
            val intent = Intent(this, Account::class.java)
            startActivity(intent)
        }

        //to Favorite page
        val toFavorite = findViewById<ImageView>(R.id.favoriteBtn)
        toFavorite.setOnClickListener {
            val intent = Intent(this, Favorite::class.java)
            startActivity(intent)
        }

        val crabBtn = findViewById<Button>(R.id.crabBtn)
        crabBtn.setOnClickListener{
            Toast.makeText(this, crabBtn.text, Toast.LENGTH_SHORT).show()
        }

        val shrimpBtn = findViewById<Button>(R.id.shrimpBtn)
        shrimpBtn.setOnClickListener{
            Toast.makeText(this, shrimpBtn.text, Toast.LENGTH_SHORT).show()
        }

        val noMeatBtn = findViewById<Button>(R.id.noMeatBtn)
        noMeatBtn.setOnClickListener{
           Toast.makeText(this, noMeatBtn.text, Toast.LENGTH_SHORT).show()
        }



    }
}