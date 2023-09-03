package ru.demchuk.data.hotel.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class InformationHotel(
    @SerialName("description")
    val description: String,

    @SerialName("peculiarities")
    val peculiarities: List<String>
)