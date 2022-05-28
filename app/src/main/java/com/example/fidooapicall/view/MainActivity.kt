package com.example.fidooapicall.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fidooapicall.Adapter.RestAdapter
import com.example.fidooapicall.R
import com.example.fidooapicall.databinding.ActivityMainBinding
import com.example.fidooapicall.databinding.ResListBinding
import com.example.fidooapicall.viewModel.MainActivityViewModel

class MainActivity : AppCompatActivity() {
private lateinit var binding: ActivityMainBinding
private lateinit var rvAdapter: RestAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(this, 2)
        binding.rvRes.layoutManager = layoutManager


        viewModel.FetchRestrauntDetails()
        viewModel._RestDetails.observe(this, Observer {
            rvAdapter = RestAdapter(it.curations)
            binding.rvRes.adapter = rvAdapter
        })









    }
}