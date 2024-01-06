package com.bavian.knes.core.utils.impl.logger

import com.bavian.knes.core.utils.api.logger.Logger
import java.util.logging.Level

internal interface LoggerLevelMapper {

    fun map(level: Logger.Level): System.Logger.Level
}

internal class LoggerLevelMapperImpl : LoggerLevelMapper {

    override fun map(level: Logger.Level): System.Logger.Level = when (level) {
        Logger.Level.DEBUG -> System.Logger.Level.DEBUG
        Logger.Level.INFO -> System.Logger.Level.INFO
        Logger.Level.WARNING -> System.Logger.Level.WARNING
        Logger.Level.ERROR -> System.Logger.Level.ERROR
    }
}