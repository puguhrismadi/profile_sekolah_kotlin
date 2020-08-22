package com.puguh.profilstarbhak.adapter

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.puguh.profilstarbhak.dataModel.DataSetPrestasiRV
import com.puguh.profilstarbhak.databinding.ListPrestasiBinding

class ListPrestasiViewHolder(private val binding:ListPrestasiBinding):RecyclerView.ViewHolder(binding.root) {
    fun bind(model:DataSetPrestasiRV){
        val adapter = ListItemPrestasiAdapter()
        binding.rvListItemPrestasi.run {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(binding.root.context)
            this.adapter = adapter
        }
        binding.titleListPrestasi.text = model.judulItem
        adapter.addData(model.listItem)
        //TODO: berikan event pada checkbox ketika icon di clik arrow ke bawah
        binding.checkBoxPrestasi.setOnCheckedChangeListener{ _,isChecked ->

            binding.rvListItemPrestasi.visibility = if(isChecked) View.VISIBLE else View.GONE
        }

    }
}