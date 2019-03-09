package com.example.kkdayui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kkdayui.R
import com.example.kkdayui.adapter.CityAdapter
import com.example.kkdayui.adapter.HomeAdapter
import com.example.kkdayui.adapter.RecentAdapter
import com.example.kkdayui.adapter.SpringAdapter
import kotlinx.android.synthetic.main.activity_main.*

open class MainActivity : AppCompatActivity() {


    lateinit var recentAdapter: RecentAdapter
    lateinit var cityAdapter: CityAdapter
    lateinit var springAdapter: SpringAdapter
    lateinit var homeAdapter: HomeAdapter



//    private val objects = ArrayList<Any>()
//    private val `object`: ArrayList<Any>
//        get() {
//            objects.add(data.recentData[0])
//            objects.add(data.cityData[0])
//            objects.add(data.springData[0])
//            return objects
//        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        initRecent()
//        initCity()
//        initSpring()

        one()
        println("************  ${this}")

    }

    fun one() {

        val allList = arrayListOf("1","2","3")
        homeAdapter = HomeAdapter(this,allList)
        rv_first.layoutManager = LinearLayoutManager(this)
        rv_first.adapter = homeAdapter




    }

//
//    fun initRecent() {
//        recentAdapter = RecentAdapter(this)
//        rv_preview.adapter = recentAdapter
//        rv_preview.layoutManager = LinearLayoutManager(applicationContext, LinearLayoutManager.HORIZONTAL, false)
//        val snapHelper = PagerSnapHelper()
//        snapHelper.attachToRecyclerView(rv_preview)
//    }
//
//
//    fun initCity() {
//        cityAdapter = CityAdapter(this)
//        rv_city.adapter = cityAdapter
//        rv_city.layoutManager = LinearLayoutManager(applicationContext, LinearLayoutManager.HORIZONTAL, false)
//        val snapHelper = PagerSnapHelper()
//        snapHelper.attachToRecyclerView(rv_city)
//
//
//    }
//
//
//    fun initSpring() {
//        springAdapter = SpringAdapter(this)
//        rv_spring.adapter = springAdapter
//
//        rv_spring.layoutManager = LinearLayoutManager(applicationContext, LinearLayoutManager.HORIZONTAL, false)
//        val snapHelper = PagerSnapHelper()
//        snapHelper.attachToRecyclerView(rv_spring)
//
//
//    }


}
