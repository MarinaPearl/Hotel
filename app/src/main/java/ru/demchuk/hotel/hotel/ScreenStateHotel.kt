package ru.demchuk.hotel.hotel

import ru.demchuk.hotel.hotel.model.HotelModelUi

sealed class ScreenStateHotel {
    object LoadingData : ScreenStateHotel()

    object Error : ScreenStateHotel()

    class LoadedData(val hotelModelUi : HotelModelUi) : ScreenStateHotel()
}