package com.example.decapodips.model

import com.example.decapodips.R

data class SpecialModel(val image: Int, val name: String, val description: String)

object StoredSpecial {
    val special = arrayListOf(
        SpecialModel(R.drawable.sauce6, "Special no.1", "Crab, Chinese, Medium"),
        SpecialModel(R.drawable.sauce5, "Special no.2", "Crab, Japanese, Medium"),
        SpecialModel(R.drawable.sauce4, "Special no.3", "Shrimp, French, Hot!")
    )
}