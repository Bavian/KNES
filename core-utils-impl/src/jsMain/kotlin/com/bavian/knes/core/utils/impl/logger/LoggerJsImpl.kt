package com.bavian.knes.core.utils.impl.logger

import com.bavian.knes.core.utils.api.logger.Logger
import kotlin.js.Console

internal class LoggerJsImpl(
    private val console: Console,
    private val loggerLevelMapper: LoggerLevelMapper,
) : Logger {

    override fun log(
        level: Logger.Level,
        tag: String,
        message: String,
        throwable: Throwable?,
    ) {
        loggerLevelMapper.map(level).invoke(console, arrayOf("$tag:", message, "throwable: $throwable"))
    }
}
