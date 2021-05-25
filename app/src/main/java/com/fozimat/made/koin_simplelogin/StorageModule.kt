package com.fozimat.made.koin_simplelogin

import org.koin.dsl.module

val storageModule = module {
    factory {
        SessionManager(get())
    }

    single {
        UserRepository(get())
    }
}