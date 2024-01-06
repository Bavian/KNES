package com.bavian.knes.core.utils.impl.logger

import android.util.Log
import com.bavian.knes.core.utils.api.logger.Logger

internal interface LoggerLevelMapper {

    fun map(level: Logger.Level): Int
}

internal class LoggerLevelMapperImpl : LoggerLevelMapper {

    override fun map(level: Logger.Level) = when (level) {
        Logger.Level.DEBUG -> Log.DEBUG
        Logger.Level.INFO -> Log.INFO
        Logger.Level.WARNING -> Log.WARN
        Logger.Level.ERROR -> Log.ERROR
    }
}