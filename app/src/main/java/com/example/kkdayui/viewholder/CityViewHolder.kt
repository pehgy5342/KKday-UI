package com.example.kkdayui.viewholder

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.kkdayui.adapter.CityAdapter
import kotlinx.android.synthetic.main.city_recyclerview.view.*
import kotlinx.android.synthetic.main.travel_recyclerview.view.*

class CityViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    fun setData() {

        val recyclerView = itemView.rv_city
        val cityAdapter = CityAdapter()
        recyclerView.layoutManager = LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)
        println("************  ${itemView.context}")
        recyclerView.adapter = cityAdapter
        
        val snapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(recyclerView)
    }
}