package com.example.kkdayui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kkdayui.R
import com.example.kkdayui.`object`.travelData
import com.example.kkdayui.dataclass.Content
import jp.wasabeef.glide.transformations.RoundedCornersTransformation
import kotlinx.android.synthetic.main.city_item.view.*

class CityAdapter : RecyclerView.Adapter<CityAdapter.CustomHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.city_item, parent, false)
        return CustomHolder(view)
    }

    override fun getItemCount() = travelData.city.count()

    override fun onBindViewHolder(holder: CustomHolder, position: Int) {



        holder.bind(travelData.city[position])




    }


    inner class CustomHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val cityName = itemView.city_name
        val cityImage = itemView.city_image

        fun bind(content: Content.CityData) {

            cityName.text = content.cityName



            Glide.with(itemView.context)
                .load(content.image)
                .transform(RoundedCornersTransformation(50, 3))
                .into(cityImage)
        }

    }


}