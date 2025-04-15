package com.ihsanarslan.datastorekoforkotlinmultiplatform.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import com.ihsanarslan.datastorekoforkotlinmultiplatform.data.local.AppPreferences

class HomeViewModel(private val preferences: AppPreferences) : ViewModel() {

    val count: StateFlow<Int> = preferences.count
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), 0)

    fun countPlus() {
        viewModelScope.launch {
            preferences.countPlus()
        }
    }

    fun countMinus() {
        viewModelScope.launch {
            preferences.countMinus()
        }
    }
}