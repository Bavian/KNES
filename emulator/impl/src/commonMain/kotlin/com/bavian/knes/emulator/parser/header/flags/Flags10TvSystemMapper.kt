package com.bavian.knes.emulator.parser.header.flags

import com.bavian.knes.emulator.data.Flags10

internal interface Flags10TvSystemMapper {

    fun map(byte: Byte): Flags10.TvSystem
}

internal class Flags10TvSystemMapperImpl : Flags10TvSystemMapper {

    override fun map(byte: Byte) = when (byte) {
        0.toByte() -> Flags10.TvSystem.NTSC
        2.toByte() -> Flags10.TvSystem.PAL
        else -> Flags10.TvSystem.DualCompatible
    }
}
