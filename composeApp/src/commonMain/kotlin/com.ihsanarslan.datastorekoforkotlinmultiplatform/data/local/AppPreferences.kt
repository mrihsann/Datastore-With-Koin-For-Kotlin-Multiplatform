package com.ihsanarslan.datastorekoforkotlinmultiplatform.data.local

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class AppPreferences(private val dataStore: DataStore<Preferences>) {

    companion object {
        private val COUNT = intPreferencesKey("count")
    }

    val count : Flow<Int> = dataStore.data.map { preferences ->
        preferences[COUNT] ?: 0
    }

    suspend fun countPlus() {
        dataStore.edit { preferences ->
            val currentCount = preferences[COUNT] ?: 0
            preferences[COUNT] = currentCount + 1
        }
    }

    suspend fun countMinus() {
        dataStore.edit { preferences ->
            val currentCount = preferences[COUNT] ?: 0
            preferences[COUNT] = currentCount - 1
        }
    }
}