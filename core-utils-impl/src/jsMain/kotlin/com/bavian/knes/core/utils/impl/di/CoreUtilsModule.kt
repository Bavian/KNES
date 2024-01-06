package com.bavian.knes.core.utils.impl.di

import com.bavian.knes.core.utils.api.logger.Logger
import com.bavian.knes.core.utils.impl.logger.LoggerJsImpl
import com.bavian.knes.core.utils.impl.logger.LoggerLevelMapper
import com.bavian.knes.core.utils.impl.logger.LoggerLevelMapperImpl
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.bind
import org.koin.dsl.module

@Suppress("FunctionName")
actual fun CoreUtilsModule() = module {
    factoryOf(::LoggerLevelMapperImpl) bind LoggerLevelMapper::class
    single { LoggerJsImpl(console, get()) } bind Logger::class
}
