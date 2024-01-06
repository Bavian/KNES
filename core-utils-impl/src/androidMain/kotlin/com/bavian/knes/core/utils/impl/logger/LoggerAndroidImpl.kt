package com.bavian.knes.core.utils.impl.logger

import android.util.Log
import com.bavian.knes.core.utils.api.logger.Logger

internal class LoggerAndroidImpl(
    private val levelMapper: LoggerLevelMapper,
) : Logger {

    override fun log(
        level: Logger.Level,
        tag: String,
        message: String,
        throwable: Throwable?,
    ) {
        val priority = levelMapper.map(level)
        Log.println(priority, tag, message)
    }
}