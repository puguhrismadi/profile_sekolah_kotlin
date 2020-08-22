package com.puguh.profilstarbhak.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.puguh.profilstarbhak.dataModel.DataSetEkskulModel
import com.puguh.profilstarbhak.dataModel.DataSetGaleriModel
import com.puguh.profilstarbhak.databinding.ListItemGaleryBinding
//binding galery
//lainya ekskul data
class ListItemEkskulAdapter:RecyclerView.Adapter<ListItemEkskulViewHolder>() {
    private val listData = arrayListOf<DataSetEkskulModel>()
    fun addData(list: List<DataSetEkskulModel>) {
        listData.clear()
        listData.addAll(list)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemEkskulViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListItemGaleryBinding.inflate(inflater, parent, false)
        return ListItemEkskulViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListItemEkskulViewHolder, position: Int) {
        val data = listData[position]
        holder.bind(data)
    }

    override fun getItemCount(): Int = listData.size

}