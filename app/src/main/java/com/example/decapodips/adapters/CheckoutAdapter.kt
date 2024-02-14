package com.example.decapodips.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.decapodips.R
import com.example.decapodips.model.CheckoutModel

class CheckoutAdapter(private val checkoutList: ArrayList<CheckoutModel>) : RecyclerView.Adapter<CheckoutAdapter.CheckoutViewHolder>(){
    inner class CheckoutViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView17)
        val titleView: TextView = itemView.findViewById(R.id.checkoutTitle)
        val descriptionView: TextView = itemView.findViewById(R.id.checkoutDes)
        val priceView: TextView = itemView.findViewById(R.id.checkoutPrice)
        val numberView: TextView = itemView.findViewById(R.id.checkoutQuantity)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CheckoutViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_checkout, parent, false)
        return CheckoutViewHolder(view)
    }

    override fun getItemCount(): Int {
        return checkoutList.size
    }

    override fun onBindViewHolder(holder: CheckoutViewHolder, position: Int) {
        val currentCheckout = checkoutList[position]
        holder.imageView.setImageResource(currentCheckout.image)
        holder.titleView.text = currentCheckout.name
        holder.descriptionView.text = currentCheckout.description
        holder.priceView.text = currentCheckout.price
        holder.numberView.text = currentCheckout.number
    }
}