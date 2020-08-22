package com.puguh.profilstarbhak.fragment

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.puguh.profilstarbhak.R
import com.puguh.profilstarbhak.adapter.ListItemGaleryAdapter
import com.puguh.profilstarbhak.dataModel.DataSetGaleri
import com.puguh.profilstarbhak.databinding.FragmentGaleryBinding

//hapus bawah import sd atas class

class GaleryFragment : Fragment() {
    //hapus baris 15 (bawah class) sd oncreateview (khusus fragment)

    //tambahan baru setelah membuat galery binding, fragmentGaleryBinding auto
    private lateinit var binding:FragmentGaleryBinding
    private  lateinit var adapter:ListItemGaleryAdapter

    //default method yg digunakan hanya oncreateview
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_galery, container, false)
        binding = FragmentGaleryBinding.inflate(inflater,container,false)
        adapter = ListItemGaleryAdapter()

        binding.listGaleryKegiatan.adapter = adapter
        binding.listGaleryKegiatan.layoutManager = LinearLayoutManager(context)
        binding.listGaleryKegiatan.setHasFixedSize(true)

        //return ke all relative layout content
        return binding.root
    }
    //menambahkan onViewCreated method
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val database=DataSetGaleri.dataSet
        adapter.addData(database)
    }
    //hapus methode companion object


}
