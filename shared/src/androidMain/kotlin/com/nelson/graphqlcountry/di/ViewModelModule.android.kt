package com.nelson.graphqlcountry.di

import com.nelson.graphqlcountry.viewModel.CountriesViewModel
import org.koin.core.module.Module
import org.koin.core.module.dsl.viewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

actual val viewModelModule: Module = module {
    viewModelOf(::CountriesViewModel)
}