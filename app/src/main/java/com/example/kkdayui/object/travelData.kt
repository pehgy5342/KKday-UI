package com.example.kkdayui.`object`

import com.example.kkdayui.R
import com.example.kkdayui.dataclass.Content

object travelData {


    val title = arrayListOf("最近瀏覽", "精選城市", "春日櫻花 浪漫獻映", "更多推薦行程")

    val recent = arrayListOf(
        Content.TravelData("【東京巴士一日遊】富士山．河口湖．忍野八海．御殿場 Outlet (保證有位)", "日本,東京", "TWD", "1,584", "(924)", R.drawable.tokyo,false),
        Content.TravelData("【韓國賞櫻推薦】首爾出發鎮海軍港節一日遊", "韓國,首爾,多個城市", "TWD", "1,333", "(42)", R.drawable.seoul,false)
        )



    val city = arrayListOf(
        Content.CityData("首爾", R.drawable.seoul2),
        Content.CityData("紐約", R.drawable.newyork),
        Content.CityData("東京", R.drawable.tokyo2),
        Content.CityData("香港", R.drawable.hongkong),
        Content.CityData("沖繩", R.drawable.okinawa),
        Content.CityData("巴黎", R.drawable.paris)
    )



    val spring = arrayListOf(
        Content.TravelData("【2019京都賞櫻】嵐山小火車保證有限量車票 (季節限定)", "日本,京都", "TWD", "360", "(146)", R.drawable.tokyo3,false),
        Content.TravelData("【韓國賞櫻推薦】首爾出發鎮海軍港節一日遊", "韓國,首爾,多個城市", "TWD", "1,330", "(42)", R.drawable.seoul,false),
        Content.TravelData("【東京巴士一日遊】箱根海盜船、小田原城、大涌谷、蘆之湖 (保證有位)", "日本,東京,多個城市", "TWD", "1,605", "(81)", R.drawable.tokyo4,false),
        Content.TravelData("【東京巴士一日遊】富士山．河口湖．忍野八海．御殿場 Outlet (保證有位)", "日本,東京", "TWD", "1,584", "(924)",R.drawable.tokyo,false),
        Content.TravelData("【大阪賞櫻巴士】吉野千本櫻．採草莓．櫻花樹下野餐", "日本,大阪,多個城市", "TWD", "2,769", "(1)", R.drawable.osaka,false),
        Content.TravelData("【福岡夜櫻半日遊】舞鶴公園步行賞夜櫻、和風會席料理", "日本,福岡", "TWD", "3,746", "(0)", R.drawable.fukuoka,false))




    val more = arrayListOf(
        Content.TravelData("【2019京都賞櫻】嵐山小火車保證有限量車票 (季節限定)", "日本,京都", "TWD", "360", "(146)", R.drawable.tokyo3,false),
        Content.TravelData("【嵐山道地玩法】嵐山小火車．巴士接駁．保津川遊船套票 (實體郵寄)", "日本,京都", "TWD", "1,978", "(279)", R.drawable.train7,false),
        Content.TravelData("【京都嵐山半日遊】嵯峨野嵐山小火車、京馬車、保津川遊船", "日本,京都", "TWD", "2,506", "(173)", R.drawable.train8,false),
        Content.TravelData("【京都景點交通票券】京都嵯峨野．嵐山小火車車票(京都車站取票)", "日本,京都", "TWD", "403", "(551)", R.drawable.train9,false),
        Content.TravelData("【關西交通票券】關西機場關空特快列車「HARUKA」車票", "日本,大阪,多個城市", "TWD", "306", "(1106)", R.drawable.express_train,false),
        Content.TravelData("【京都一日遊】嵯峨野嵐山小火車、清水寺、伏見稻荷大社", "日本,大阪,多個城市", "TWD", "2,503", "(114)", R.drawable.train10,false)
    )



}
