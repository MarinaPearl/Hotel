package ru.demchuk.data.hotel.api

import retrofit2.http.GET
import ru.demchuk.data.hotel.model.Hotel

interface ApiDataHotel {
    @GET("35e0d18e-2521-4f1b-a575-f0fe366f66e3")
    fun getHotelApiStorage(): Hotel
}