package com.example.kkdayui.adapter

import android.content.Context
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.kkdayui.item.ImageItem
import com.example.kkdayui.R

class SliderAdapter(context: Context, private val imageList: ArrayList<ImageItem>) :
    androidx.viewpager.widget.PagerAdapter() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)


    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`

    }

    override fun getCount(): Int {
        return imageList.size

    }

    override fun instantiateItem(view: ViewGroup, position: Int): Any {
        val imageLayout = inflater.inflate(R.layout.slider_image, view, false)
        val imageView = imageLayout.findViewById(R.id.image) as ImageView

        imageView.setImageResource(imageList[position].getimage())

        view.addView(imageLayout, 0)
        return imageLayout

    }


    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

    override fun restoreState(state: Parcelable?, loader: ClassLoader?) {}

    override fun saveState(): Parcelable? {
        return null
    }


}