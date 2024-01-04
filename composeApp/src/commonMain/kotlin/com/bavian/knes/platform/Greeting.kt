package com.bavian.knes.platform

interface Greeting {

    val greet: String
}

internal class GreetingImpl(
    private val platform: Platform,
) : Greeting {

    override val greet get() = "Hello, ${platform.name}!"
}