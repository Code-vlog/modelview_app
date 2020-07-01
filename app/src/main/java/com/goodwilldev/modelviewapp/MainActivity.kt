package com.goodwilldev.modelviewapp

import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.goodwilldev.modelviewapp.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
//        viewModel.getCount().observe(this, Observer {it_->
//            text.text = it_.toString();
//        })

        binding.lifecycleOwner = this
        binding.viewmodel = viewModel
        button.setOnClickListener {
            //view model
            viewModel.SetCount()
        }

    }
}