package com.ihsanarslan.datastorekoforkotlinmultiplatform.di

import com.ihsanarslan.datastorekoforkotlinmultiplatform.ui.home.HomeViewModel
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

fun viewModelModule()  = module {
    factoryOf(::HomeViewModel)
}