package com.bavian.knes.emulator.parser.header.flags

import com.bavian.knes.emulator.data.Flags9
import kotlin.experimental.or

private inline val Boolean.tvSystem get() = if (this) Flags9.TvSystem.NTSC else Flags9.TvSystem.PAL

internal interface Flags9Parser {

    fun parse(byte: Byte): Flags9
}

internal class Flags9ParserImpl : Flags9Parser {

    override fun parse(byte: Byte) = Flags9(
        tvSystem = (byte or 1 > 0).tvSystem,
    )
}
