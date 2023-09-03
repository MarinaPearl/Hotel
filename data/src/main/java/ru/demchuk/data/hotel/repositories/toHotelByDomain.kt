package ru.demchuk.data.hotel.repositories

import ru.demchuk.data.hotel.model.Hotel
import ru.demchuk.domain.model.InformationHotel

internal fun Hotel.toHotelByDomain(): ru.demchuk.domain.model.Hotel {

    val informationHotelByDomain = InformationHotel(
        description = this.informationHotel.description,
        peculiarities = this.informationHotel.peculiarities
    )

    return ru.demchuk.domain.model.Hotel(
        hotelId = hotelId,
        name = name,
        adress = adress,
        minimalPrice = minimalPrice,
        priceForIt = priceForIt,
        rating = rating,
        ratingName = ratingName,
        imageUrls = imageUrls,
        informationHotel = informationHotelByDomain
    )
}