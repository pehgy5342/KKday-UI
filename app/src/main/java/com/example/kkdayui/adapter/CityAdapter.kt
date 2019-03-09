package com.example.kkdayui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kkdayui.R
import com.example.kkdayui.`object`.data
import com.example.kkdayui.`object`.data.cityimage
import com.example.kkdayui.`object`.data.cityname
import com.example.kkdayui.item.CityItem
import kotlinx.android.synthetic.main.city_item.view.*

class CityAdapter : RecyclerView.Adapter<CityAdapter.CustomHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.city_item, parent, false)
        return CustomHolder(view)
    }

    override fun getItemCount() = cityname.count()

    override fun onBindViewHolder(holder: CustomHolder, position: Int) {


        holder.cityName.text = data.cityname[position]
        holder.cityImage.setImageResource(cityimage[position]!!)
    }


    inner class CustomHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val cityName = itemView.city_name
        val cityImage = itemView.city_image
    }


}