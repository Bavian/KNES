package com.bavian.knes.core.utils.api.logger

interface Logger {

    fun log(
        level: Level,
        tag: String,
        message: String,
        throwable: Throwable? = null,
    )

    enum class Level {
        DEBUG,
        INFO,
        WARNING,
        ERROR,
        ;
    }
}
