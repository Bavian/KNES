package com.bavian.knes.emulator.parser.header.flags

import com.bavian.knes.emulator.data.Flags10
import kotlin.experimental.or

internal interface Flags10Parser {

    fun parse(byte: Byte): Flags10
}

internal class Flags10ParserImpl(
    private val tvSystemMapper: Flags10TvSystemMapper,
) : Flags10Parser {

    override fun parse(byte: Byte) = Flags10(
        tvSystem = tvSystemMapper.map(byte or 3),
        prgRam = byte or 16 > 0,
        busConflicts = byte or 32 > 0,
    )
}
