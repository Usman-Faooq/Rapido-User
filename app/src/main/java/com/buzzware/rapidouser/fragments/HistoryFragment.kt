package com.buzzware.rapidouser.fragments

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.buzzware.rapidouser.R
import com.buzzware.rapidouser.adapter.DeliveredAdapter
import com.buzzware.rapidouser.adapter.NewDeliveryAdapter
import com.buzzware.rapidouser.databinding.FragmentHistoryBinding

class HistoryFragment : Fragment() {

    lateinit var binding : FragmentHistoryBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentHistoryBinding.inflate(layoutInflater)


        setView()
        setListener()
        setNewDeliveryAdapter()

        return binding.root
    }

    private fun setView() {

    }

    private fun setListener() {

        binding.newDeliveryTab.setOnClickListener {

            binding.newDeliveryTab.setBackgroundColor(resources.getColor(R.color.dark_red_color))
            binding.newDeliveryTab.setTextColor(resources.getColor(R.color.white))

            binding.alreadyDeliveredTab.setBackgroundColor(Color.TRANSPARENT)
            binding.alreadyDeliveredTab.setTextColor(resources.getColor(R.color.black))

            setNewDeliveryAdapter()


        }


        binding.alreadyDeliveredTab.setOnClickListener {

            binding.alreadyDeliveredTab.setBackgroundColor(resources.getColor(R.color.dark_red_color))
            binding.alreadyDeliveredTab.setTextColor(resources.getColor(R.color.white))

            binding.newDeliveryTab.setBackgroundColor(Color.TRANSPARENT)
            binding.newDeliveryTab.setTextColor(resources.getColor(R.color.black))

            setAlreadyDeliveredAdapter()


        }

    }

    private fun setNewDeliveryAdapter() {

        binding.recyclerView.layoutManager = LinearLayoutManager(requireActivity())
        binding.recyclerView.adapter = NewDeliveryAdapter(requireActivity(), emptyList())

    }

    private fun setAlreadyDeliveredAdapter() {

        binding.recyclerView.layoutManager = LinearLayoutManager(requireActivity())
        binding.recyclerView.adapter = DeliveredAdapter(requireActivity(), emptyList())

    }

}