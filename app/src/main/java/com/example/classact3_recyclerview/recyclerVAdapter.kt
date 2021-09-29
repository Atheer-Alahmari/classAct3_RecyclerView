package com.example.classact3_recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.text_view.view.*

class recyclerVAdapter (private val nameList : ArrayList<String>): RecyclerView.Adapter<recyclerVAdapter.ItemViewHolder>() {
    class ItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.text_view,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val name = nameList[position]

        holder.itemView.apply {
            textView.text = name
        }
    }

    override fun getItemCount() = nameList.size
}




