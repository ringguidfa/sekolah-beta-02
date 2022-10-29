package com.example.pertemuan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pertemuan2.databinding.ActivityMainBinding
import java.util.IllegalFormatCodePointException

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var skorA = 0
    var SkorB = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonPlusA.setOnClickListener {
            SkorB = SkorB + 1
            binding.tvSkorA.text= SkorB.toString()
        }
        binding.buttonPlusB.setOnClickListener {
            SkorB = SkorB + 1
            binding.tvSkorB.text = SkorB.toString()
        }
        binding.buttonMinA.setOnClickListener {
            if (SkorB>0)
            SkorB = SkorB - 1
            binding.tvSkorA.text= SkorB.toString()
        }
        binding.buttonMinB.setOnClickListener {
           if (SkorB>0)
            SkorB = SkorB - 1
            binding.tvSkorB.text = SkorB.toString()
        }
        binding.tvTeamA.text = "Team A"

        binding.buttonReset.setOnClickListener {
            SkorB = 0
            SkorB = 0
            binding.tvSkorA.text = SkorB.toString()
            binding.tvSkorB.text = SkorB.toString()
        }
    }
}