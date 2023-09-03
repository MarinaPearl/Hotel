package ru.demchuk.domain.model

data class Hotel(
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