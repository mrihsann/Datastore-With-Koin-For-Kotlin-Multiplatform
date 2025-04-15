package com.ihsanarslan.datastorekoforkotlinmultiplatform

import android.app.Application
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import com.ihsanarslan.datastorekoforkotlinmultiplatform.di.initKoin
import org.koin.core.context.GlobalContext
import org.koin.dsl.module

class MainApp: Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin()

        GlobalContext.get().loadModules(
            listOf(
                module {
                    single<DataStore<Preferences>> { createDataStore(applicationContext) }
                }
            )
        )
    }
}