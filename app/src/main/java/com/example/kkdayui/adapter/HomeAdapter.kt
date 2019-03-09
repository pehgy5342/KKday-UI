package com.example.kkdayui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kkdayui.R
import com.example.kkdayui.`object`.data
import com.example.kkdayui.viewholder.CityViewHolder
import com.example.kkdayui.viewholder.RecentViewHolder
import com.example.kkdayui.viewholder.SpringViewHolder
import kotlinx.android.synthetic.main.second_recyclerview.view.*
import java.util.*

class HomeAdapter(var context: Context, var list: ArrayList<String>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


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




    override fun getItemCount() = list.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):RecyclerView.ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.second_recyclerview, parent, false)


        return when (viewType) {
            RECENTLAYOUT -> {
                RecentViewHolder(view)

            }
            CITYLAYOUT -> {
                CityViewHolder(view)
            }
            else -> {
                SpringViewHolder(view)
            }
        }


    }



    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, position: Int) {
        when (viewHolder) {

            is RecentViewHolder -> {
//                viewHolder.setData(list[position])
                viewHolder.setData(viewHolder)
                viewHolder.itemView.title.text = data.title[position]
            }

            is CityViewHolder -> {
//                viewHolder.setData(list[position])
                viewHolder.setData(viewHolder)
                viewHolder.itemView.title.text = data.title[position]
            }

            is SpringViewHolder -> {
//                viewHolder.setData(list[position])
                viewHolder.setData(viewHolder)
                viewHolder.itemView.title.text = data.title[position]
            }


        }

    }


//    inner class CustomHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
//
//
//        val title = itemView.recent_title
//        val recyclerview = itemView.rv_second
//
//        fun bind(list:Any) {
//
////            title.text = list.
//
//
//
//        }
//    }


}
