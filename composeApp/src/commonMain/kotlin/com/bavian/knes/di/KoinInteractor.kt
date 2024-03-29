package com.bavian.knes.di

import com.bavian.knes.core.utils.impl.di.CoreUtilsModule
import com.bavian.knes.emulator.di.EmulatorModule
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
            CoreUtilsModule(),
            EmulatorModule(),
        )
    }
}

expect val KoinInteractor.platformModule: Module
