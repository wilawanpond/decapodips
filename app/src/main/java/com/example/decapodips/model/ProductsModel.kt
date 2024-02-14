package com.example.decapodips.model

import com.example.decapodips.R

data class Product(val image: Int, val name: String, val price: String)

// to store products
object StoredProducts {
    val products = arrayListOf(
        Product(R.drawable.sauce1, "Decapodips Original", "$ 2.5"),
        Product(R.drawable.sauce2, "Decapodips Special", "$ 4"),
        Product(R.drawable.sauce3, "Decapodips Extra Spicy", "$ 3"),
        Product(R.drawable.sauce4, "Decapodips Mild", "$ 2"),
        Product(R.drawable.sauce5, "Decapodips Spicy", "$ 2.5"),
        Product(R.drawable.sauce6, "Decapodips Secret", "$ 6")
    )
}
