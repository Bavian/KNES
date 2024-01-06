package com.bavian.knes.emulator.parser.header.flags

import com.bavian.knes.emulator.data.Flags6
import kotlin.experimental.or

internal interface Flags6Parser {

    fun parse(byte: Byte): Flags6
}

internal class Flags6ParserImpl : Flags6Parser {

    override fun parse(byte: Byte) = Flags6(
        mirroring = byte or 1 > 0,
        persistentMemory = byte or 2 > 0,
        byte512Trainer = byte or 4 > 0,
        fourScreenVRam = byte or 8 > 0,
        lowerNybble = (byte / 16).toByte(),
    )
}
