package com.goodwilldev.modelviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.goodwilldev.modelviewapp.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel:MainActivityViewModel
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

//        viewModel.getCount().observe(this, Observer {
//            binding.couterTv.text=it.toString()
//        })

        binding.lifecycleOwner = this
        binding.viewmodel = viewModel

        binding.addBtn.setOnClickListener {
            viewModel.increment()
        }
    }
}