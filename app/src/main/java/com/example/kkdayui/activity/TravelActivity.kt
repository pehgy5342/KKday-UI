package com.example.kkdayui.activity

import android.os.Bundle
import android.os.Handler
import com.example.kkdayui.R
import com.example.kkdayui.adapter.SliderAdapter
import com.example.kkdayui.item.ImageItem
import kotlinx.android.synthetic.main.activity_travel.*
import java.util.*

class TravelActivity : MainActivity() {
    private var allimageList: ArrayList<ImageItem>? = null

    private var myimageList = intArrayOf(
        R.drawable.train1,
        R.drawable.train2,
        R.drawable.train3,
        R.drawable.train4,
        R.drawable.train5,
        R.drawable.train6
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travel)

        allimageList = ArrayList()
        allimageList = populateList()

        init()
    }

    private fun populateList(): ArrayList<ImageItem> {

        val list = ArrayList<ImageItem>()

        for (i in 0..5) {

            val imageitem = ImageItem()
            imageitem.setimage(myimageList[i])
            list.add(imageitem)
        }

        return list
    }


    private fun init() {
        mPager = findViewById(R.id.viewPager)

        mPager!!.adapter = SliderAdapter(this, this.allimageList!!)

        indicator.setViewPager(mPager)

        val density = resources.displayMetrics.density

        indicator.radius = 5 * density

        NUM_PAGES = allimageList!!.size


        val handler = Handler()
        val Update = Runnable {

            if (currentPage == NUM_PAGES) {
                currentPage = 0
            }
            mPager!!.setCurrentItem(currentPage++, true)
        }
        val swipeTimer = Timer()
        swipeTimer.schedule(object : TimerTask() {
            override fun run() {
                handler.post(Update)
            }
        }, 3000, 3000)

        indicator.setOnPageChangeListener(object : androidx.viewpager.widget.ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(p0: Int) {

            }

            override fun onPageScrolled(p0: Int, p1: Float, p2: Int) {
            }

            override fun onPageSelected(position: Int) {
                currentPage = position
            }

        })
    }


    companion object {

        private var mPager: androidx.viewpager.widget.ViewPager? = null
        private var currentPage = 0
        private var NUM_PAGES = 0
    }

}