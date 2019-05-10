package com.example.kkdayui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kkdayui.R
import com.example.kkdayui.adapter.HomeAdapter
import kotlinx.android.synthetic.main.activity_main.*

open class MainActivity : AppCompatActivity() {


    lateinit var homeAdapter: HomeAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        initView()
    }

    fun initView() {


        homeAdapter = HomeAdapter(this)
        rv_first.layoutManager = LinearLayoutManager(this)
        rv_first.adapter = homeAdapter


    }


}
