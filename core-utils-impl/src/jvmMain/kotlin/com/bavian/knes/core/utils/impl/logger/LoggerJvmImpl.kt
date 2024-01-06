package com.bavian.knes.core.utils.impl.logger

import com.bavian.knes.core.utils.api.logger.Logger

internal class LoggerJvmImpl(
    private val systemLogger: System.Logger,
    private val loggerLevelMapper: LoggerLevelMapper,
) : Logger {

    override fun log(
        level: Logger.Level,
        tag: String,
        message: String,
        throwable: Throwable?,
    ) {
        val systemLevel = loggerLevelMapper.map(level)
        systemLogger.log(systemLevel, "$tag: $message", throwable)
    }
}