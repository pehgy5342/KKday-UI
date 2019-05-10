package com.example.kkdayui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kkdayui.R
import com.example.kkdayui.`object`.travelData
import com.example.kkdayui.viewholder.CityViewHolder
import com.example.kkdayui.viewholder.RecentViewHolder
import com.example.kkdayui.viewholder.SpringViewHolder
import kotlinx.android.synthetic.main.travel_recyclerview.view.*

class HomeAdapter(var context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    companion object {


        val RECENTLAYOUT = 0
        val CITYLAYOUT = 1
        val SPRINGLAYOUT = 2


    }


    override fun getItemViewType(position: Int): Int {
        return when (position) {

            0 -> RECENTLAYOUT
            1 -> CITYLAYOUT
            else -> {
                SPRINGLAYOUT
            }

        }
    }


    override fun getItemCount() = 3

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        val view_travel = LayoutInflater.from(parent.context).inflate(R.layout.travel_recyclerview, parent, false)
        val view_city = LayoutInflater.from(parent.context).inflate(R.layout.city_recyclerview, parent, false)

        return when (viewType) {
            RECENTLAYOUT -> {
                RecentViewHolder(view_travel)

            }
            CITYLAYOUT -> {
                CityViewHolder(view_city)
            }
            else -> {
                SpringViewHolder(view_travel)
            }
        }


    }


    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, position: Int) {


        when (viewHolder) {


            is RecentViewHolder -> {
                viewHolder.setData()
                viewHolder.itemView.title.text = travelData.title[position]
            }

            is CityViewHolder -> {
                viewHolder.setData()
            }

            is SpringViewHolder -> {
                viewHolder.setData()
                viewHolder.itemView.title.text = travelData.title[position]
            }


        }

    }


}
