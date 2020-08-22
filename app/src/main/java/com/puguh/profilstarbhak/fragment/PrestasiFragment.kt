package com.puguh.profilstarbhak.fragment

import android.content.AbstractThreadedSyncAdapter
import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.puguh.profilstarbhak.R
import com.puguh.profilstarbhak.adapter.ListPrestasiAdapter
import com.puguh.profilstarbhak.dataModel.DataSetFragmentPrestasi
import com.puguh.profilstarbhak.dataModel.DataSetPrestasiRV
import com.puguh.profilstarbhak.databinding.FragmentPrestasiBinding


class PrestasiFragment : Fragment() {
    private lateinit var binding:FragmentPrestasiBinding
    private lateinit var adapterRv:ListPrestasiAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_prestasi, container, false)
        binding = FragmentPrestasiBinding.inflate(inflater,container,false)
        adapterRv = ListPrestasiAdapter()

        binding.revPrestasi.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
            adapter = adapterRv
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val data = DataSetFragmentPrestasi.dataSet
        adapterRv.addData(data)
       // super.onViewCreated(view, savedInstanceState)
    }
}
