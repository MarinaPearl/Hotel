package ru.demchuk.domain.repositories

import ru.demchuk.domain.model.Hotel

interface ReceiverHotel {

    fun receiveHotel(): Hotel
}