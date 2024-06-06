package com.buzzware.rapidouser.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.buzzware.rapidouser.R
import com.buzzware.rapidouser.databinding.ActivityAccountSelectionBinding

class AccountSelectionActivity : AppCompatActivity() {

    lateinit var binding : ActivityAccountSelectionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAccountSelectionBinding.inflate(layoutInflater)
        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)

        setView()
        setListener()

        setContentView(binding.root)
    }

    private fun setView() {

        binding.appBar.titleTV.text = "Sign Up"
    }

    private fun setListener() {

        binding.appBar.backIV.setOnClickListener {
            finish()
        }

        binding.myselfTV.setOnClickListener {
            val intent = Intent(this, SignUpPatientInfoActivity::class.java)
            startActivity(intent)
            overridePendingTransition(androidx.appcompat.R.anim.abc_fade_in, androidx.appcompat.R.anim.abc_fade_out)
        }

        binding.elseTV.setOnClickListener {
            val intent = Intent(this, SignUpMyInfoActivity::class.java)
            startActivity(intent)
            overridePendingTransition(androidx.appcompat.R.anim.abc_fade_in, androidx.appcompat.R.anim.abc_fade_out)
        }

    }
}