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
import com.puguh.profilstarbhak.adapter.ListItemEkskulAdapter
import com.puguh.profilstarbhak.dataModel.DataSetEkskul
import com.puguh.profilstarbhak.databinding.FragmentEskulBinding


class EskulFragment : Fragment() {
    private lateinit var binding: FragmentEskulBinding
    private lateinit var adapter:ListItemEkskulAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_eskul, container, false)
        binding = FragmentEskulBinding.inflate(inflater,container,false)
        adapter = ListItemEkskulAdapter()

        binding.listEkskul.adapter = adapter
        binding.listEkskul.layoutManager = LinearLayoutManager(context)
        binding.listEkskul.setHasFixedSize(true)

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val data = DataSetEkskul.dataSet
        adapter.addData(data)
    }

}
