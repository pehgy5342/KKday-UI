package com.example.kkdayui.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kkdayui.`object`.data
import com.example.kkdayui.activity.TravelActivity
import com.example.kkdayui.item.Content
import kotlinx.android.synthetic.main.travel_item.view.*


class RecentAdapter : RecyclerView.Adapter<RecentAdapter.CustomHolder>() {

    companion object {
        val TOKYO = 0
        val SEOUL = 1

    }

    override fun getItemViewType(position: Int): Int {
        if (position == 0) {
            TOKYO
        } else {
            SEOUL
        }

        return position
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomHolder {
        val view = LayoutInflater.from(parent.context).inflate(com.example.kkdayui.R.layout.travel_item, parent, false)
        return CustomHolder(view)

    }

    override fun getItemCount() = data.recent.count()


    override fun onBindViewHolder(holder: CustomHolder, position: Int) {


        holder.bind(data.recent[position])



        holder.cardView.setOnClickListener {

            val intent = Intent(it.context, TravelActivity::class.java)

//            intent.putExtra("Info", recentinfo)
//            intent.putExtra("Place", recentplace)
//            intent.putExtra("Money", recentprice)

            it.context.startActivity(intent)


        }

    }


    inner class CustomHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        val info = itemView.info
        val place = itemView.place
        val twd = itemView.twd
        val price = itemView.price
        val stars = itemView.stars
        val image = itemView.image
        val cardView = itemView.cardView
        val check = itemView.home_check


        fun bind(content: Content.TravelData) {

            info.text = content.info
            place.text = content.place
            twd.text = content.twd
            price.text = content.price
            stars.text = content.starts
            image.setImageResource(content.image)
            check.isChecked = content.checkBox

            check.setOnClickListener {

                data.recent[position].checkBox = !data.recent[position].checkBox

            }

        }


    }
}