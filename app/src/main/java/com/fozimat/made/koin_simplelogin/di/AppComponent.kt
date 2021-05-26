package com.fozimat.made.koin_simplelogin.di

import android.content.Context
import com.fozimat.made.koin_simplelogin.HomeActivity
import com.fozimat.made.koin_simplelogin.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [StorageModule::class])
interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun inject(activity: MainActivity)
    fun inject(activity: HomeActivity)
}