package com.bavian.knes.emulator.parser.header.flags

import com.bavian.knes.emulator.data.Flags8

internal interface Flags8Parser {

    fun parse(byte: Byte): Flags8
}

internal class Flags8ParserImpl : Flags8Parser {

    override fun parse(byte: Byte) = Flags8(
        prgRamSize = byte,
    )
}
