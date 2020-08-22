package com.puguh.profilstarbhak.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.puguh.profilstarbhak.dataModel.DataSetPrestasiModel
import com.puguh.profilstarbhak.databinding.ListItemPrestasiBinding

class ListItemPrestasiAdapter:RecyclerView.Adapter<ListItemPrestasiViewHolder>() {
    private val listData = arrayListOf<DataSetPrestasiModel>()
    fun addData(list:List<DataSetPrestasiModel>){
        listData.clear()
        listData.addAll(list)
        notifyDataSetChanged()

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemPrestasiViewHolder {
       val inflater = LayoutInflater.from(parent.context)
        val binding = ListItemPrestasiBinding.inflate(inflater,parent,false)
        return ListItemPrestasiViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListItemPrestasiViewHolder, position: Int) {
        val data = listData[position]
        holder.bind(data)
    }

    override fun getItemCount(): Int = listData.size
}