package com.example.kkdayui.viewholder

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.kkdayui.adapter.RecentAdapter
import com.example.kkdayui.item.Content
import kotlinx.android.synthetic.main.travel_recyclerview.view.*

class RecentViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    fun setData() {

        val recyclerView = itemView.rv_travel

        val recentAdapter = RecentAdapter()
        println("88888$recentAdapter")
        recyclerView.layoutManager = LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = recentAdapter

        val snapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(recyclerView)
    }


}