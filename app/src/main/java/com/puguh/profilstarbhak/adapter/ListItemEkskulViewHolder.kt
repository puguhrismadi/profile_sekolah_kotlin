package com.puguh.profilstarbhak.adapter

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.puguh.profilstarbhak.dataModel.DataSetEkskulModel
import com.puguh.profilstarbhak.dataModel.DataSetGaleriModel
import com.puguh.profilstarbhak.databinding.ListItemGaleryBinding

class ListItemEkskulViewHolder(private val binding:ListItemGaleryBinding):RecyclerView.ViewHolder(binding.root) {
    fun bind(model: DataSetEkskulModel){
        binding.titleListGaleri.text = model.judul
        binding.subtitleListGaleri.text = model.deskripsi
        Glide.with(binding.root).load(model.gambar).into(binding.imageListGaleri)
    }
}