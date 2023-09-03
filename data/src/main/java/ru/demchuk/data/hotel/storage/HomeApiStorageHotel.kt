package ru.demchuk.data.hotel.storage

import ru.demchuk.data.Client
import ru.demchuk.data.hotel.api.ApiDataHotel

class HomeApiStorageHotel : StorageHotel{
    override fun getDataAboutHotel() : ApiDataHotel {
       return Client.getDataAboutHotel()
    }
}