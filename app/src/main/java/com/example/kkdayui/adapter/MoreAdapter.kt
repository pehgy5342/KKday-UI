package com.example.kkdayui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kkdayui.R
import com.example.kkdayui.`object`.travelData
import com.example.kkdayui.dataclass.Content
import kotlinx.android.synthetic.main.travel_item.view.*

class MoreAdapter : RecyclerView.Adapter<MoreAdapter.CustomHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.travel_item, parent, false)
        return CustomHolder(view)
    }

    override fun getItemCount() = travelData.more.count()

    override fun onBindViewHolder(holder: CustomHolder, position: Int) {




        holder.bind(travelData.more[position])


    }


    inner class CustomHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val info = itemView.info
        val place = itemView.place
        val twd = itemView.twd
        val price = itemView.price
        val starts = itemView.stars
        val image = itemView.image
        val check = itemView.home_check


        fun bind(content:Content.TravelData) {
            info.text = content.info
            place.text = content.place
            twd.text = content.twd
            price.text = content.price
            starts.text = content.starts
            image.setImageResource(content.image)
            check.isChecked = content.checkBox

            check.setOnClickListener {

                travelData.more[position].checkBox = !travelData.more[position].checkBox

            }



        }


    }

}