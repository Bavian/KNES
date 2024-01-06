package com.bavian.knes.platform

import com.bavian.knes.core.utils.api.logger.Logger

interface Greeting {

    val greet: String
}

internal class GreetingImpl(
    private val platform: Platform,
    private val logger: Logger,
) : Greeting {

    override val greet
        get(): String {
            val message = "Hello, ${platform.name}!"
            logger.log(Logger.Level.DEBUG, "Greeting", message)

            return message
        }
}
