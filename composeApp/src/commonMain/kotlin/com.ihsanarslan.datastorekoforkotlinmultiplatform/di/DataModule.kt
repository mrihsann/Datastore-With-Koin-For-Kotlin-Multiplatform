package com.ihsanarslan.datastorekoforkotlinmultiplatform.di

import com.ihsanarslan.datastorekoforkotlinmultiplatform.data.local.AppPreferences
import org.koin.dsl.module

fun dataModule()  = module {
    single { AppPreferences(get()) }
}