package com.unero.catty.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.unero.catty.data.Cat
import com.unero.catty.databinding.ItemCatBinding

class CatAdapter(private val list: ArrayList<Cat>): RecyclerView.Adapter<CatAdapter.CatViewHolder>() {

    inner class  CatViewHolder(private val binding: ItemCatBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(cat: Cat){
            binding.apply {
                ivThumbnail.setImageResource(cat.thumbnail)
                ivThumbnail.contentDescription = cat.breed
                tvBreed.text = cat.breed
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatViewHolder {
        val binding = ItemCatBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CatViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CatViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}