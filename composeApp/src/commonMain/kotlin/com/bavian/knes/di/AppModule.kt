package com.bavian.knes.di

import com.bavian.knes.platform.Greeting
import com.bavian.knes.platform.GreetingImpl
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

internal inline val KoinInteractor.appModule
    get() = module {
        singleOf(::GreetingImpl) { bind<Greeting>() }
    }