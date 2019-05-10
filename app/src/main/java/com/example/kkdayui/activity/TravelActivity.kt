package com.example.kkdayui.activity

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import com.example.kkdayui.R
import com.example.kkdayui.adapter.MoreAdapter
import com.example.kkdayui.adapter.SliderAdapter
import kotlinx.android.synthetic.main.activity_travel.*

class TravelActivity : MainActivity() {
    lateinit var moreAdapter: MoreAdapter


    private var myImageList = intArrayOf(
        R.drawable.train1,
        R.drawable.train2,
        R.drawable.train3,
        R.drawable.train4,
        R.drawable.train5,
        R.drawable.train6
    )

    var sliderAdapter: SliderAdapter = SliderAdapter(this, myImageList)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travel)

        toolbar.title = "【2019京都賞櫻】嵐山小火車保證有限量車票 (季節限定)"

        init()
        travel()
    }


    private fun init() {


        viewPager.adapter = sliderAdapter
        indicator.setViewPager(viewPager)


        val density = resources.displayMetrics.density
        indicator.radius = 5 * density


    }

    private fun travel() {

        moreAdapter = MoreAdapter()
        rv_travel.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rv_travel.adapter = moreAdapter


        val snapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(rv_travel)


    }


}