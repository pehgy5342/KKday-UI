package com.example.kkdayui.`object`

import com.example.kkdayui.R
import com.example.kkdayui.item.CityItem
import com.example.kkdayui.item.RecentItem
import com.example.kkdayui.item.ViewItem

object data {


    val viewItem = ArrayList<ViewItem>()

//        viewItem.add(ViewItem("最近瀏覽"))
//        viewItem.add(ViewItem("精選城市"))
//        viewItem.add(ViewItem("春日櫻花 浪漫獻映"))

    val title = arrayListOf("最近瀏覽", "精選城市", "春日櫻花 浪漫獻映")


    //    val recentData: ArrayList<RecentItem>
//        get() {
//            val recentList = ArrayList<RecentItem>()
//            recentList.add(RecentItem("【東京巴士一日遊】富士山．河口湖．忍野八海．御殿場 Outlet (保證有位)","日本,東京","1","TWD","1,584",R.drawable.tokyo))
//            recentList.add(RecentItem("【韓國賞櫻推薦】首爾出發鎮海軍港節一日遊","韓國,首爾,多個城市","2","TWD","1,333",R.drawable.seoul))
//
//            return recentList
    val recentinfo = arrayListOf("【東京巴士一日遊】富士山．河口湖．忍野八海．御殿場 Outlet (保證有位)", "【韓國賞櫻推薦】首爾出發鎮海軍港節一日遊")
    val recentplace = arrayListOf("日本,東京", "韓國,首爾,多個城市")
    val recentvalue = arrayListOf("1", "2")
    val recenttwd = arrayListOf("TWD", "TWD")
    val recentprice = arrayListOf("1,584", "1,333")
    val recentimage = intArrayOf(R.drawable.tokyo, R.drawable.seoul)

//        }

//    val cityData :ArrayList<CityItem>
//    get() {
//        val cityList = ArrayList<CityItem>()
//        cityList.add(CityItem("首爾",R.drawable.seoul2))
//        cityList.add(CityItem("紐約",R.drawable.newyork))
//        cityList.add(CityItem("東京",R.drawable.tokyo2))
//        cityList.add(CityItem("香港",R.drawable.hongkong))
//        cityList.add(CityItem("沖繩",R.drawable.okinawa))
//        cityList.add(CityItem("巴黎",R.drawable.paris))
//
//        return cityList
//    }

    val cityimage = intArrayOf(
        R.drawable.seoul2,
        R.drawable.newyork,
        R.drawable.tokyo2,
        R.drawable.hongkong,
        R.drawable.okinawa,
        R.drawable.paris
    )
    val cityname = arrayListOf("首爾", "紐約", "東京", "香港", "沖繩", "巴黎")


//    val springData: ArrayList<RecentItem>
//        get() {
//            val springList = ArrayList<RecentItem>()
//            springList.add(RecentItem("【2019京都賞櫻】嵐山小火車保證有限量車票 (季節限定)","日本,京都","1","TWD","359",R.drawable.tokyo3))
//            springList.add(RecentItem("【韓國賞櫻推薦】首爾出發鎮海軍港節一日遊","韓國,首爾,多個城市","2","TWD","1,333",R.drawable.seoul))
//            springList.add(RecentItem("【東京巴士一日遊】箱根海盜船、小田原城、大涌谷、蘆之湖 (保證有位)","日本,東京,多個城市","3","TWD","1,599",R.drawable.tokyo4))
//            springList.add(RecentItem("【東京巴士一日遊】富士山．河口湖．忍野八海．御殿場 Outlet (保證有位)","日本,東京","4","TWD","1,584",R.drawable.tokyo))
//
//            return springList

    val springinfo = arrayListOf(
        "【2019京都賞櫻】嵐山小火車保證有限量車票 (季節限定)",
        "【韓國賞櫻推薦】首爾出發鎮海軍港節一日遊",
        "【東京巴士一日遊】箱根海盜船、小田原城、大涌谷、蘆之湖 (保證有位)",
        "【東京巴士一日遊】富士山．河口湖．忍野八海．御殿場 Outlet (保證有位)"
    )
    val springplace = arrayListOf("日本,京都", "韓國,首爾,多個城市", "日本,東京,多個城市", "日本,東京")
    val springvalue = arrayListOf("1", "2", "3", "4")
    val springtwd = arrayListOf("TWD", "TWD", "TWD", "TWD")
    val springprice = arrayListOf("360", "1,330", "1,605", "1,584")
    val springimage = intArrayOf(
        R.drawable.tokyo3,
        R.drawable.seoul,
        R.drawable.tokyo4,
        R.drawable.tokyo
    )
}
