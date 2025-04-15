package com.ihsanarslan.datastorekoforkotlinmultiplatform.di

import com.ihsanarslan.datastorekoforkotlinmultiplatform.data.local.AppPreferences
import com.ihsanarslan.datastorekoforkotlinmultiplatform.ui.home.HomeViewModel
import org.koin.core.context.startKoin
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

val dataModule = module {
    single { AppPreferences(get()) }
}

val viewModelModule = module {
    factoryOf(::HomeViewModel)
}

fun initKoin() {
    startKoin {
        modules(
            dataModule,
            viewModelModule,
        )
    }
}