package com.example.kkdayui.item

class RecentItem {
    var info: String? = null
    var place: String? = null
    var value: String? = null
    var twd: String? = null
    var money: String? = null
    var image: Int? = 0

    constructor(info: String, place: String, value: String, twd: String, money: String, image: Int) {
        this.info = info
        this.place = place
        this.value = value
        this.twd = twd
        this.money = money
        this.image = image
    }
}