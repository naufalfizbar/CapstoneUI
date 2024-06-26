package com.example.myapplication.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.test.R
import com.example.test.data.response.Animal

class ListHistoryAdapter(private val listAnimal: ArrayList<Animal>) : RecyclerView.Adapter<ListHistoryAdapter.ListViewHolder>(){
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
            val tvName: TextView = itemView.findViewById(R.id.tv_item_name)
            val tvDescription: TextView = itemView.findViewById(R.id.tv_item_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_history, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int = listAnimal.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, description, photo) = listAnimal[position]
        holder.imgPhoto.setImageResource(photo)
        holder.tvName.text = name
        holder.tvDescription.text = description
    }
}