package com.bavian.knes.core.utils.impl.logger

import com.bavian.knes.core.utils.api.logger.Logger
import kotlin.js.Console
import kotlin.reflect.KFunction2

internal interface LoggerLevelMapper {

    fun map(level: Logger.Level): KFunction2<Console, Array<out Any?>, Unit>
}

internal class LoggerLevelMapperImpl : LoggerLevelMapper {

    override fun map(level: Logger.Level): KFunction2<Console, Array<out Any?>, Unit> = when (level) {
        Logger.Level.DEBUG -> Console::log
        Logger.Level.INFO -> Console::info
        Logger.Level.WARNING -> Console::warn
        Logger.Level.ERROR -> Console::error
    }
}