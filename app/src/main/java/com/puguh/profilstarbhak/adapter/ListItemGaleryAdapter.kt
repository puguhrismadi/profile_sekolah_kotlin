package com.puguh.profilstarbhak.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.puguh.profilstarbhak.dataModel.DataSetGaleriModel
import com.puguh.profilstarbhak.databinding.ListItemGaleryBinding

class ListItemGaleryAdapter: RecyclerView.Adapter<ListItemGaleryViewHolder>() {
    private val listData = arrayListOf<DataSetGaleriModel>()
    fun addData(list: List<DataSetGaleriModel>) {
        listData.clear()
        listData.addAll(list)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemGaleryViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListItemGaleryBinding.inflate(inflater, parent, false)
        return ListItemGaleryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListItemGaleryViewHolder, position: Int) {
        val data = listData[position]
        holder.bind(data)
        holder.itemView.setOnClickListener{
            Toast.makeText(it.context,listData[position].judul,Toast.LENGTH_SHORT).show()
        }


    }

    override fun getItemCount(): Int = listData.size

}