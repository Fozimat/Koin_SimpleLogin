package com.fozimat.made.koin_simplelogin.di

import android.content.Context
import com.fozimat.made.koin_simplelogin.SessionManager
import dagger.Module
import dagger.Provides

@Module
class StorageModule {
    @Provides
    fun provideSessionManager(context: Context): SessionManager = SessionManager(context)
}