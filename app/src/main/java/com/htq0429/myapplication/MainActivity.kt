package com.htq0429.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.htq0429.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        val myTextView: TextView = findViewById(R.id.myTextView)
//        myTextView.text = "Check out my new text!"
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val myBank: Int = 200
        if (binding.usdText.text.isNotEmpty()){
//            val dollarValue = binding.usdText.text.toString().toFloat()
            val dollarValue = myBank.toString()
            val euroValue = myBank * 1.72f
            binding.textView.text = euroValue.toString()
        }
        else{
            binding.textView.text = ""
        }
    }
}