package com.bavian.knes.di

import org.koin.core.KoinApplication
import org.koin.core.context.startKoin
import org.koin.core.module.Module

object KoinInteractor {

    fun start(
        preStart: KoinApplication.() -> Unit = {},
    ) = startKoin {
        preStart()
        modules(
            appModule,
            platformModule,
        )
    }
}

expect val KoinInteractor.platformModule: Module
