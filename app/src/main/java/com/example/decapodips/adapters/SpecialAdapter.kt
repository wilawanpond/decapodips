package com.example.decapodips.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.decapodips.R
import com.example.decapodips.model.SpecialModel

class SpecialAdapter(private val specialList: ArrayList<SpecialModel>) : RecyclerView.Adapter<SpecialAdapter.SpecialViewHolder>() {
    inner class SpecialViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView20)
        val titleView: TextView = itemView.findViewById(R.id.textView29)
        val desView: TextView = itemView.findViewById(R.id.textView30)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SpecialViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_special, parent, false)
        return SpecialViewHolder(view)
    }

    override fun getItemCount(): Int {
       return specialList.size
    }

    override fun onBindViewHolder(holder: SpecialViewHolder, position: Int) {
        val special = specialList[position]
        holder.imageView.setImageResource(special.image)
        holder.titleView.text = special.name
        holder.desView.text = special.description
    }
}