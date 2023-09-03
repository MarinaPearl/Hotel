package ru.demchuk.data.hotel.repositories

import ru.demchuk.data.hotel.storage.StorageHotel
import ru.demchuk.domain.model.Hotel
import ru.demchuk.domain.repositories.ReceiverHotel

class ReceiverHotelImpl(private val homeApiStorage: StorageHotel) : ReceiverHotel {

    override fun receiveHotel(): Hotel {
        return homeApiStorage.getDataAboutHotel().getHotelApiStorage().toHotelByDomain()
    }
}