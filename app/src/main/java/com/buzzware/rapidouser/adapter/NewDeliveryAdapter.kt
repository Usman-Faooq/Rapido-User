package com.buzzware.rapidouser.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.buzzware.rapidouser.databinding.ItemDesignNewDeliveryLayoutBinding

class NewDeliveryAdapter(val context : Context, val list: List<String>) :
    RecyclerView.Adapter<NewDeliveryAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewDeliveryAdapter.ViewHolder {
        return ViewHolder(ItemDesignNewDeliveryLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: NewDeliveryAdapter.ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 15
    }

    inner class ViewHolder(private val binding : ItemDesignNewDeliveryLayoutBinding) : RecyclerView.ViewHolder(binding.root)
}