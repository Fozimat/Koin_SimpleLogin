package com.fozimat.made.koin_simplelogin

import android.app.Application
import com.fozimat.made.koin_simplelogin.di.AppComponent
import com.fozimat.made.koin_simplelogin.di.DaggerAppComponent

open class MyApplication : Application(){
    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(
            applicationContext
        )
    }
}