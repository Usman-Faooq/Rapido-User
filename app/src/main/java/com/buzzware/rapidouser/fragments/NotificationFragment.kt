package com.buzzware.rapidouser.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.buzzware.rapidouser.R
import com.buzzware.rapidouser.databinding.FragmentNotificationBinding

class NotificationFragment : Fragment() {

    lateinit var binding : FragmentNotificationBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentNotificationBinding.inflate(layoutInflater)

        setView()
        setListener()

        return binding.root
    }

    private fun setView() {

    }

    private fun setListener() {

    }

}