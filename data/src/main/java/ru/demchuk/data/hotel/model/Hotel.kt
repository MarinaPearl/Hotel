package ru.demchuk.data.hotel.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Hotel(
    @SerialName("id")
    val hotelId: Int,

    @SerialName("name")
    val name: String,

    @SerialName("adress")
    val adress: String,

    @SerialName("minimal_price")
    val minimalPrice: Int,

    @SerialName("price_for_it")
    val priceForIt: String,

    @SerialName("rating")
    val rating: Int,

    @SerialName("rating_name")
    val ratingName: String,

    @SerialName("image_urls")
    val imageUrls: List<String>,

    @SerialName("about_the_hotel")
    val informationHotel: InformationHotel
)