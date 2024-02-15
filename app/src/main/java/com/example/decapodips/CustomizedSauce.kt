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

        //toast carb
        val crabBtn = findViewById<Button>(R.id.crabBtn)
        crabBtn.setOnClickListener{
            Toast.makeText(this, crabBtn.text , Toast.LENGTH_SHORT).show()
        }

        //toast shrimp
        val shrimpBtn = findViewById<Button>(R.id.shrimpBtn)
        shrimpBtn.setOnClickListener{
            Toast.makeText(this, shrimpBtn.text, Toast.LENGTH_SHORT).show()
        }
        //toast no meat
        val noMeatBtn = findViewById<Button>(R.id.noMeatBtn)
        noMeatBtn.setOnClickListener{
           Toast.makeText(this, noMeatBtn.text, Toast.LENGTH_SHORT).show()
        }

        //toast garlic
        val garlicBtn = findViewById<Button>(R.id.garlicBtn)
        garlicBtn.setOnClickListener{
            Toast.makeText(this, garlicBtn.text, Toast.LENGTH_SHORT).show()
        }

        //toast chili
        val chiliBtn = findViewById<Button>(R.id.chiliBtn)
        chiliBtn.setOnClickListener{
            Toast.makeText(this, chiliBtn.text, Toast.LENGTH_SHORT).show()
        }

        //toast coriander
        val corianderBtn = findViewById<Button>(R.id.corianderBtn)
        corianderBtn.setOnClickListener{
            Toast.makeText(this, corianderBtn.text, Toast.LENGTH_SHORT).show()
        }


        //toast eschalot
        val eschalotBtn = findViewById<Button>(R.id.eschalotBtn)
        eschalotBtn.setOnClickListener{
            Toast.makeText(this, eschalotBtn.text, Toast.LENGTH_SHORT).show()
        }

        //toast ginger
        val gingerBtn = findViewById<Button>(R.id.gingerBtn)
        gingerBtn.setOnClickListener{
            Toast.makeText(this, gingerBtn.text, Toast.LENGTH_SHORT).show()
        }

        //toast btn
        val pepperBtn = findViewById<Button>(R.id.pepperBtn)
        pepperBtn.setOnClickListener{
            Toast.makeText(this, pepperBtn.text, Toast.LENGTH_SHORT).show()
        }

        //toast mild
        val mildBtn = findViewById<Button>(R.id.mildBtn)
        mildBtn.setOnClickListener{
            Toast.makeText(this, mildBtn.text, Toast.LENGTH_SHORT).show()
        }

        //toast original
        val originalBtn = findViewById<Button>(R.id.originalBtn)
        originalBtn.setOnClickListener{
            Toast.makeText(this, originalBtn.text, Toast.LENGTH_SHORT).show()
        }

        //toast medium
        val mediumBtn = findViewById<Button>(R.id.mediumBtn)
        mediumBtn.setOnClickListener{
            Toast.makeText(this, mediumBtn.text, Toast.LENGTH_SHORT).show()
        }


        //toast hot
        val hotBtn = findViewById<Button>(R.id.hotBtn)
        hotBtn.setOnClickListener{
            Toast.makeText(this, hotBtn.text, Toast.LENGTH_SHORT).show()
        }









    }
}