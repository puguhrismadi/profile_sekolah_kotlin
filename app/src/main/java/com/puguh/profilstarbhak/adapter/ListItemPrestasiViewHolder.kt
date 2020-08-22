package com.puguh.profilstarbhak.adapter

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.puguh.profilstarbhak.dataModel.DataSetPrestasiModel
import com.puguh.profilstarbhak.databinding.ListItemPrestasiBinding

class ListItemPrestasiViewHolder(private val binding:ListItemPrestasiBinding):RecyclerView.ViewHolder(binding.root) {
    fun bind(model:DataSetPrestasiModel){
        binding.judulGambar.text = model.judulGambar
        Glide.with(binding.root).load(model.urlGambar)
            .centerCrop()
            .into(binding.gambarPrestasi)
    }
}