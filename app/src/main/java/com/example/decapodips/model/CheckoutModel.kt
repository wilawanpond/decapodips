package com.example.decapodips.model

import com.example.decapodips.R

data class CheckoutModel(val image: Int, val name: String, val description: String, val price: String, val number: String)

object StoredCheckout {
    val checkout = arrayListOf(
        CheckoutModel(R.drawable.sauce3, "Decapodips Mayo", "Shrimps, Crabs", "$2.01", "1"),
        CheckoutModel(R.drawable.sauce2, "Decapodips Garlic", "Shrimps, Crabs", "$3.02", "1"),
        CheckoutModel(R.drawable.sauce1, "Decapodips Sweet", "Shrimps, Crabs","$1.23", "1"),
        CheckoutModel(R.drawable.sauce6, "Decapodips French", "Shrimps, Crabs","$2.0", "2"),
        CheckoutModel(R.drawable.sauce5, "Decapodips Hot!", "Shrimps, Crabs","$1.5", "1"),
        CheckoutModel(R.drawable.sauce4,"Special no.2","Shrimps, Crabs","$2.5","2")
    )
}
