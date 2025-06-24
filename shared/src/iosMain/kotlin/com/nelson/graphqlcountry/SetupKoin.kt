package com.nelson.graphqlcountry

import com.nelson.graphqlcountry.di.sharedModule
import com.nelson.graphqlcountry.di.viewModelModule
import org.koin.core.context.startKoin
import org.koin.dsl.module

fun initKoin(){
    startKoin {
        modules(
            sharedModule,
            viewModelModule
        )
    }
}