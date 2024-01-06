package com.bavian.knes.emulator.parser.header

internal interface NesParser {

    fun parse(vararg bytes: Byte): String
}

internal class NesParserImpl : NesParser {

    override fun parse(vararg bytes: Byte) = bytes.decodeToString()
}
