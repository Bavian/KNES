package com.bavian.knes.di

import com.bavian.knes.platform.Platform
import com.bavian.knes.platform.PlatformAndroidImpl
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

actual val KoinInteractor.platformModule
    get() = module {
        singleOf(::PlatformAndroidImpl) { bind<Platform>() }
    }