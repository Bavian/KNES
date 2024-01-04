package com.bavian.knes.di

import com.bavian.knes.platform.Platform
import com.bavian.knes.platform.PlatformJsImpl
import org.koin.core.module.Module
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

actual val KoinInteractor.platformModule: Module
    get() = module {
        singleOf(::PlatformJsImpl) { bind<Platform>() }
    }

