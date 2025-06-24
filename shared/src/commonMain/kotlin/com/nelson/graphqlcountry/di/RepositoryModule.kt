package com.nelson.graphqlcountry.di

import com.nelson.graphqlcountry.repository.CountriesRepository
import org.koin.dsl.module

val sharedModule = module {
    single { CountriesRepository() }
}