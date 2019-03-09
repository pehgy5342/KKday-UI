package com.example.kkdayui.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kkdayui.R
import com.example.kkdayui.activity.TravelActivity
import com.example.kkdayui.`object`.data
import com.example.kkdayui.`object`.data.recentinfo
import com.example.kkdayui.`object`.data.recentplace
import com.example.kkdayui.`object`.data.recentprice
import com.example.kkdayui.`object`.data.recentvalue
import kotlinx.android.synthetic.main.recent_item.view.*

class RecentAdapter : RecyclerView.Adapter<RecentAdapter.CustomHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recent_item, parent, false)
        return CustomHolder(view)

    }

    override fun getItemCount() = recentinfo.count()

    override fun onBindViewHolder(holder: CustomHolder, position: Int) {


        holder.info.text = data.recentinfo[position]
        holder.place.text = data.recentplace[position]
//        holder.value.text = data.recentvalue[position]
        holder.twd.text = data.recenttwd[position]
        holder.money.text = data.recentprice[position]
        holder.image.setImageResource(data.recentimage[position])

        holder.cardView.setOnClickListener {

            val intent = Intent(it.context, TravelActivity::class.java)

            intent.putExtra("Info", recentinfo)
            intent.putExtra("Place", recentplace)
            intent.putExtra("Value", recentvalue)
            intent.putExtra("Money", recentprice)

            it.context.startActivity(intent)


        }

    }


    inner class CustomHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val info = itemView.info
        val place = itemView.place
//        val value = itemView.value
        val twd = itemView.twd
        val money = itemView.money
        val image = itemView.image
        val cardView = itemView.cardView


    }
}