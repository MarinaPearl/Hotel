package ru.demchuk.hotel.hotel.model


data class HotelModelUi(
    val hotelId: Int,

    val name: String,

    val adress: String,

    val minimalPrice: Int,

    val priceForIt: String,

    val rating: Int,

    val ratingName: String,

    val imageUrls: List<String>,

    val informationHotel: InformationHotel
)