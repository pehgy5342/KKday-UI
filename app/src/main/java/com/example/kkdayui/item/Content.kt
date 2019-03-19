package com.example.kkdayui.item

class Content {
    data class TravelData(
        val info: String,
        val place: String,
        val twd: String,
        val price: String,
        val starts: String,
        val image: Int,
        var checkBox: Boolean
    )

    data class CityData(val cityName: String, val image: Int)


}