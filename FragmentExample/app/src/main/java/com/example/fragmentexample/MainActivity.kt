package com.example.fragmentexample

import AFragment
import BFragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFragmentA.setOnClickListener {
            supportFragmentManager.beginTransaction().add(R.id.container_fragment, AFragment()).commit()
        }

        binding.btnFragmentB.setOnClickListener {
            supportFragmentManager.beginTransaction().add(R.id.container_fragment, BFragment()).commit()
        }
    }
}