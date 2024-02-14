package com.example.decapodips.adapters

import android.view.View
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.decapodips.R
import com.example.decapodips.model.Product

class ProductsAdapter(private val productsList: ArrayList<Product>) : RecyclerView.Adapter<ProductsAdapter.ProductViewHolder>() {

    inner class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.productImage)
        val textView: TextView = itemView.findViewById(R.id.productName)
        val priceView: TextView = itemView.findViewById(R.id.textView31)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_item, parent, false)
        return ProductViewHolder(view)
    }

    override fun getItemCount(): Int {
        return productsList.size
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = productsList[position]
        // set data
        holder.imageView.setImageResource(product.image)
        holder.textView.text = product.name
        holder.priceView.text = product.price
    }
}