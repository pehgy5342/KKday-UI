package com.example.kkdayui.viewholder

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.kkdayui.adapter.SpringAdapter
import kotlinx.android.synthetic.main.second_recyclerview.view.*

class SpringViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    fun setData(viewHolder: SpringViewHolder) {

        val recyclerView = viewHolder.itemView.rv_second


        val springAdapter = SpringAdapter()
        recyclerView.layoutManager = LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = springAdapter

        val snapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(recyclerView)
    }



}