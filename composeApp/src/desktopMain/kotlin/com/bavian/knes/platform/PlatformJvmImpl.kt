package com.bavian.knes.platform

internal class PlatformJvmImpl : Platform {

    override val name = "Java ${System.getProperty("java.version")}"
}