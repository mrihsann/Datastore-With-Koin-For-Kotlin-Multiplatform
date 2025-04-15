package com.ihsanarslan.datastorekoforkotlinmultiplatform.di

import com.ihsanarslan.datastorekoforkotlinmultiplatform.ui.home.HomeViewModel
import org.koin.core.context.startKoin
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

val dataModule = module {

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