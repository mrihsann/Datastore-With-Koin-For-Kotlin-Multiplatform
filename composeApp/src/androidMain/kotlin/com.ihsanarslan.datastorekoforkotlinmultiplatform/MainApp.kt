package com.ihsanarslan.datastorekoforkotlinmultiplatform

import android.app.Application
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import com.ihsanarslan.datastorekoforkotlinmultiplatform.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

class MainApp: Application() {

    private val androidModules = module {
        single<DataStore<Preferences>> { createDataStore(applicationContext) }
    }

    override fun onCreate() {
        super.onCreate()
        setupKoin()
    }

    private fun setupKoin() {
        initKoin(additionalModules = listOf(androidModules)) {
            androidContext(applicationContext)
        }
    }
}