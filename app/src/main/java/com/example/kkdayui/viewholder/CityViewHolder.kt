package com.example.kkdayui.viewholder

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.kkdayui.adapter.CityAdapter
import kotlinx.android.synthetic.main.second_recyclerview.*
import kotlinx.android.synthetic.main.second_recyclerview.view.*

class CityViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    fun setData(viewHolder: CityViewHolder) {

        val recyclerView = viewHolder.itemView.rv_second
        val cityAdapter = CityAdapter()
        recyclerView.layoutManager = LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)
        println("************  ${itemView.context}")
        recyclerView.adapter = cityAdapter
        
        val snapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(recyclerView)
    }
}