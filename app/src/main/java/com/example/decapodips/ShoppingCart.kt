package com.example.decapodips

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.decapodips.adapters.CheckoutAdapter
import com.example.decapodips.model.StoredCheckout

class ShoppingCart : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var checkoutAdapter: CheckoutAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_cart)

        init()

        // check out button to check out page
        val checkOutBtn = findViewById<Button>(R.id.checkOutBtn)
        checkOutBtn.setOnClickListener {
            val intent = Intent(this, CheckOut::class.java)
            startActivity(intent)
        }

        // back button clicking
        val backBtn = findViewById<ImageView>(R.id.backBtn)
        backBtn.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun init() {
        recyclerView = findViewById(R.id.shoppingcartRecycler)
        recyclerView.setHasFixedSize(true)
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager

        checkoutAdapter = CheckoutAdapter(StoredCheckout.checkout)
        recyclerView.adapter = checkoutAdapter

    }
}