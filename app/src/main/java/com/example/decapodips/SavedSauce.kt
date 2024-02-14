package com.example.decapodips

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
    }

    private fun init() {
        recyclerView = findViewById(R.id.savedSauceRecycler)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        specialAdapter = SpecialAdapter(StoredSpecial.special)
        recyclerView.adapter = specialAdapter
    }
}