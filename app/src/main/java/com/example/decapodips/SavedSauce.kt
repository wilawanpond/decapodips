package com.example.decapodips

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.decapodips.adapters.SpecialAdapter
import com.example.decapodips.model.StoredSpecial

class SavedSauce : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var specialAdapter: SpecialAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saved_sauce)

        init()

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


        // to CustomizedSauce Page
        val toUrSauce = findViewById<ImageView>(R.id.sauceBtn)
        toUrSauce.setOnClickListener{
            val intent = Intent(this, CustomizedSauce::class.java)
            startActivity(intent)
        }

    }

    private fun init() {
        recyclerView = findViewById(R.id.savedSauceRecycler)
        recyclerView.setHasFixedSize(true)
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager

        specialAdapter = SpecialAdapter(this, StoredSpecial.special)
        recyclerView.adapter = specialAdapter
    }


}