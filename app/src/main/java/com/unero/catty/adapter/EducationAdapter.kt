package com.unero.catty.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.unero.catty.data.Education
import com.unero.catty.databinding.ItemEducationBinding

class EducationAdapter(private val list: ArrayList<Education>):
    RecyclerView.Adapter<EducationAdapter.EducationViewHolder>() {

    inner class EducationViewHolder(private val binding: ItemEducationBinding):
        RecyclerView.ViewHolder(binding.root){
        fun bind(education: Education){
            binding.apply {
                tvSchool.text = education.name
                tvCourse.text = education.course
                tvDate.text = education.date
                ivSchool.apply {
                    setImageResource(education.photo)
                    contentDescription = education.name
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EducationViewHolder {
        val binding = ItemEducationBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return EducationViewHolder(binding)
    }

    override fun onBindViewHolder(holder: EducationViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}