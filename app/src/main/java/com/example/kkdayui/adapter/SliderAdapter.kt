package com.example.kkdayui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.kkdayui.R

class SliderAdapter(context: Context, private val list: IntArray) :
    androidx.viewpager.widget.PagerAdapter() {




    override fun getCount(): Int {
        return list.size

    }

    //當前viewpager位置
    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = LayoutInflater.from(container.context).inflate(R.layout.slider_image, container, false)
        val imageView = view.findViewById(R.id.image) as ImageView

        imageView.setImageResource(list[position])

        container.addView(view)
        return view

    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`

    }


    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }



}