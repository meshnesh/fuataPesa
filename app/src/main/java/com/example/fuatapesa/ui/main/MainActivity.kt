package com.example.fuatapesa.ui.main

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.fuatapesa.R
import com.example.fuatapesa.base.BaseActivity
import com.example.fuatapesa.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }
}