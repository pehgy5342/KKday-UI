package com.example.kkdayui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kkdayui.R
import com.example.kkdayui.`object`.data
import com.example.kkdayui.`object`.data.springinfo
import kotlinx.android.synthetic.main.spring_item.view.*

class SpringAdapter : RecyclerView.Adapter<SpringAdapter.CustomHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.spring_item, parent, false)
        return CustomHolder(view)

    }

    override fun getItemCount() = springinfo.count()

    override fun onBindViewHolder(holder: CustomHolder, position: Int) {

        holder.info.text = data.springinfo[position]
        holder.place.text = data.springplace[position]
//        holder.value.text = data.springvalue[position]
        holder.twd.text = data.springtwd[position]
        holder.price.text = data.springprice[position]
        holder.image.setImageResource(data.springimage[position])

    }


    inner class CustomHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val info = itemView.info
        val place = itemView.place
//        val value = itemView.value
        val price = itemView.money
        val twd = itemView.twd
        val image = itemView.image
    }
}