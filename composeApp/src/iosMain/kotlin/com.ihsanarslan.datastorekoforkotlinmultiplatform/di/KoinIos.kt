package com.ihsanarslan.datastorekoforkotlinmultiplatform.di

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import com.ihsanarslan.datastorekoforkotlinmultiplatform.createDataStore
import org.koin.dsl.module

val iosModules = module {
    single <DataStore<Preferences>>{ createDataStore() }
}

fun initKoinIOS() = initKoin(additionalModules = listOf(iosModules))
