package ru.demchuk.hotel.hotel.viewModel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import ru.demchuk.hotel.hotel.ScreenStateHotel

class ViewModelHotel : ViewModel() {

    private val _searchState: MutableStateFlow<ScreenStateHotel> =
        MutableStateFlow(ScreenStateHotel.LoadingData)
    val searchState: StateFlow<ScreenStateHotel> get() = _searchState.asStateFlow()

    val searchQueryState: MutableSharedFlow<String> = MutableSharedFlow()

}