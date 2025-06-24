package com.nelson.graphqlcountry

import android.app.Application
import com.nelson.graphqlcountry.di.sharedModule
import com.nelson.graphqlcountry.di.viewModelModule
import org.koin.core.context.startKoin

class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(
                sharedModule,
                viewModelModule
            )
        }
    }
}