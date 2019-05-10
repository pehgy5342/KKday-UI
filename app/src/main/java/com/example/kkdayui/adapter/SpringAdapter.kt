package com.example.kkdayui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kkdayui.R
import com.example.kkdayui.`object`.travelData
import com.example.kkdayui.dataclass.Content
import kotlinx.android.synthetic.main.travel_item.view.*

class SpringAdapter : RecyclerView.Adapter<SpringAdapter.CustomHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.travel_item, parent, false)
        return CustomHolder(view)

    }

    override fun getItemCount() = travelData.spring.count()

    override fun onBindViewHolder(holder: CustomHolder, position: Int) {


        holder.bind(travelData.spring[position])

    }


    inner class CustomHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val info = itemView.info
        val place = itemView.place
        val price = itemView.price
        val starts = itemView.stars
        val twd = itemView.twd
        val image = itemView.image
        val check = itemView.home_check

        fun bind(content: Content.TravelData) {

            info.text = content.info
            place.text = content.place
            price.text = content.price
            starts.text = content.starts
            twd.text = content.twd
            image.setImageResource(content.image)
            check.isChecked = content.checkBox

            check.setOnClickListener {

                println("************** before ${com.example.kkdayui.`object`.travelData.spring[position].checkBox}")
                travelData.spring[position].checkBox = !travelData.spring[position].checkBox
                println("************** after ${com.example.kkdayui.`object`.travelData.spring[position].checkBox}")

            }


        }
    }
}