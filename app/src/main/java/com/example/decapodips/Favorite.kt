package com.example.decapodips

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.decapodips.adapters.ProductsAdapter
import com.example.decapodips.model.StoredProducts

class Favorite : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var productsAdapter: ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite)

        init()

        val toHome = findViewById<ImageView>(R.id.homeBtn)
        toHome.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val toUrSauce = findViewById<ImageView>(R.id.sauceBtn)
        toUrSauce.setOnClickListener{
            val intent = Intent(this,CustomizedSauce::class.java )
            startActivity(intent)
        }

        val toAccount = findViewById<ImageView>(R.id.accountBtn)
        toAccount.setOnClickListener{
            val intent = Intent(this,Account::class.java)
            startActivity(intent)
        }
    }

    private fun init() {
        recyclerView = findViewById(R.id.recyclerView1)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        productsAdapter = ProductsAdapter(StoredProducts.products)
        recyclerView.adapter = productsAdapter
    }


}