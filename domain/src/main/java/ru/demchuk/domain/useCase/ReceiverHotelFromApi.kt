package ru.demchuk.domain.useCase

import ru.demchuk.domain.model.Hotel
import ru.demchuk.domain.repositories.ReceiverHotel

class ReceiverHotelFromApi(private val repository: ReceiverHotel) {

    fun receiveHotelFromApi(): Hotel {
        return repository.receiveHotel()
    }
}