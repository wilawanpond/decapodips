package com.example.decapodips

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.decapodips.adapters.ProductsAdapter
import com.example.decapodips.model.StoredProducts

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
//    private lateinit var productsList: ArrayList<Product>
    private lateinit var productsAdapter: ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        val extras = intent.extras
        if (extras != null) {
            val value = extras.getString("username")
            val showMessage = findViewById<TextView>(R.id.txvShowMessage)
            showMessage.text = value

            val message = extras.getString("login_username")
            val showMessage1 = findViewById<TextView>(R.id.showMessageText)
            showMessage1.text = message
        }

        // Click on profile icon
        val profileIcon = findViewById<ImageView>(R.id.profileIcon)
        profileIcon.setOnClickListener{
            var intent = Intent(this, Account::class.java)
            startActivity(intent)
        }

        // click on account icon
        val accountBtn = findViewById<ImageView>(R.id.accountBtn)
        accountBtn.setOnClickListener {
            var intent = Intent(this, Account::class.java)
            startActivity(intent)
        }

        // clicking on sauceBtn
        val sauceBtn = findViewById<ImageView>(R.id.sauceBtn)
        sauceBtn.setOnClickListener {
            var intent = Intent(this, CustomizedSauce::class.java)
            startActivity(intent)
        }

        val toFavorite = findViewById<ImageView>(R.id.favoriteBtn)
        toFavorite.setOnClickListener {
            var intent = Intent(this,Favorite::class.java)
            startActivity(intent)
        }
    }

    private fun init() {
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        productsAdapter = ProductsAdapter(StoredProducts.products)
        recyclerView.adapter = productsAdapter
    }
}