package com.example.converter

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.converter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.buttonConverter.setOnClickListener {
            binding.textView.text = (binding.editEuro.text.toString().toDouble() * 1.11).toString()

        }
        binding.buttonReal.setOnClickListener {
            binding.textView.text = (binding.editEuro.text.toString().toDouble() * 6.12).toString()

        }
        binding.buttonPeso.setOnClickListener {
            binding.textView.text = (binding.editEuro.text.toString().toDouble() * 21.56).toString()

        }
    }
}