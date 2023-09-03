package ru.demchuk.data.hotel.storage

import ru.demchuk.data.hotel.api.ApiDataHotel

interface StorageHotel {
    fun getDataAboutHotel() : ApiDataHotel
}