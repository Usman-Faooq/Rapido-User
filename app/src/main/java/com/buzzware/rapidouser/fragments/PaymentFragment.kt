package com.buzzware.rapidouser.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.buzzware.rapidouser.R
import com.buzzware.rapidouser.databinding.FragmentPaymentBinding

class PaymentFragment : Fragment() {

    lateinit var binding : FragmentPaymentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentPaymentBinding.inflate(layoutInflater)


        setView()
        setListener()

        return binding.root
    }

    private fun setView() {

    }

    private fun setListener() {

        binding.cardLayout.setOnClickListener {
            setRadioCheck(binding.cardRadio, binding.appleRadio, binding.googleRadio, binding.cashRadio)
        }

        binding.appleLayout.setOnClickListener {
            setRadioCheck(binding.appleRadio, binding.cardRadio, binding.googleRadio, binding.cashRadio)
        }

        binding.googleLayout.setOnClickListener {
            setRadioCheck(binding.googleRadio, binding.appleRadio, binding.cardRadio, binding.cashRadio)
        }

        binding.cashLayout.setOnClickListener {
            setRadioCheck(binding.cashRadio, binding.appleRadio, binding.googleRadio, binding.cardRadio)
        }

    }

    private fun setRadioCheck(selectedIV: ImageView, unselected1: ImageView, unselected2: ImageView, unselected3: ImageView) {
        selectedIV.setImageResource(R.drawable.icon_radio_check)
        unselected1.setImageResource(R.drawable.icon_radio_uncheck)
        unselected2.setImageResource(R.drawable.icon_radio_uncheck)
        unselected3.setImageResource(R.drawable.icon_radio_uncheck)
    }

}