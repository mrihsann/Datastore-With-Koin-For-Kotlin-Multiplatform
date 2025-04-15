package com.ihsanarslan.datastorekoforkotlinmultiplatform

import android.app.Application
import com.ihsanarslan.datastorekoforkotlinmultiplatform.di.initKoin

class MainApp: Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin()
    }
}