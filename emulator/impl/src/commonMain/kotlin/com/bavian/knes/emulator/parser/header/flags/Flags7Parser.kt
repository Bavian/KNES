package com.bavian.knes.emulator.parser.header.flags

import com.bavian.knes.emulator.data.Flags7
import kotlin.experimental.or

internal interface Flags7Parser {

    fun parse(byte: Byte): Flags7
}

internal class Flags7ParserImpl : Flags7Parser {

    override fun parse(byte: Byte) = Flags7(
        vsUnisystem = byte or 1 > 0,
        playChoice10 = byte or 2 > 0,
        nes20 = byte or 12 == 8.toByte(),
        upperNybble = (byte / 16).toByte(),
    )
}
