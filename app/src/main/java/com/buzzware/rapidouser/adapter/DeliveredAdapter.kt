package com.buzzware.rapidouser.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.buzzware.rapidouser.databinding.ItemDesignNewDeliveryLayoutBinding

class DeliveredAdapter(val context : Context, val list: List<String>) :
    RecyclerView.Adapter<DeliveredAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DeliveredAdapter.ViewHolder {
        return ViewHolder(ItemDesignNewDeliveryLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: DeliveredAdapter.ViewHolder, position: Int) {

        holder.binding.statusTV.text = "Delivered"
    }

    override fun getItemCount(): Int {
        return 15
    }

    inner class ViewHolder(val binding : ItemDesignNewDeliveryLayoutBinding) : RecyclerView.ViewHolder(binding.root)
}