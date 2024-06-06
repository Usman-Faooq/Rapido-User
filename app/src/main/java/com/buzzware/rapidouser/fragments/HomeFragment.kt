package com.buzzware.rapidouser.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.buzzware.rapidouser.R
import com.buzzware.rapidouser.constants.FragmentListener
import com.buzzware.rapidouser.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    lateinit var binding : FragmentHomeBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(layoutInflater)

        setView()
        setListener()

        return binding.root
    }

    private fun setView() {

    }

    private fun setListener() {

        binding.orderNowTV.setOnClickListener {
            (activity as FragmentListener).loadFragment("homeOrderNow")
        }

        binding.scheduleDeliveryTV.setOnClickListener {
            (activity as FragmentListener).loadFragment("homeSchedule")
        }

    }

}