package com.buzzware.rapidouser.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.buzzware.rapidouser.databinding.ActivitySignUpPatientInfoBinding

class SignUpPatientInfoActivity : AppCompatActivity() {

    lateinit var binding : ActivitySignUpPatientInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpPatientInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)

        setView()
        setListener()
    }

    private fun setView() {
        binding.appBar.titleTV.text = "Sign Up"


    }

    private fun setListener() {
        binding.appBar.backIV.setOnClickListener {
            finish()
        }

        binding.createAccountTV.setOnClickListener {
            val intent = Intent(this, ConsentFormActivity::class.java)
            startActivity(intent)
            overridePendingTransition(androidx.appcompat.R.anim.abc_fade_in, androidx.appcompat.R.anim.abc_fade_out)
        }
    }
}