package com.buzzware.rapidouser.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.buzzware.rapidouser.R
import com.buzzware.rapidouser.databinding.FragmentAccountBinding
import com.buzzware.rapidouser.databinding.FragmentNotificationBinding

class AccountFragment : Fragment() {

    lateinit var binding : FragmentAccountBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentAccountBinding.inflate(layoutInflater)

        setView()
        setListener()

        return binding.root
    }

    private fun setView() {

    }

    private fun setListener() {
        binding.saveTV.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }
}