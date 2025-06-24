package com.nelson.graphqlcountry.di

import com.nelson.graphqlcountry.viewModel.CountriesViewModel
import org.koin.core.component.KoinComponent
import org.koin.core.module.Module
import org.koin.core.module.single
import org.koin.dsl.module
import org.koin.core.component.get

actual val viewModelModule: Module
    = module {
        single{
            CountriesViewModel()
        }
}
object SharedViewModelModule : KoinComponent{
    fun getCountriesViewModel():CountriesViewModel = get()
}