package com.example.decapodips

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
    }

    private fun init() {
        recyclerView = findViewById(R.id.recyclerView1)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        productsAdapter = ProductsAdapter(StoredProducts.products)
        recyclerView.adapter = productsAdapter
    }
}