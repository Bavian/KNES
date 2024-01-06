package com.bavian.knes.emulator.parser

import com.bavian.knes.emulator.api.data.RomStream
import com.bavian.knes.emulator.data.RomData
import com.bavian.knes.emulator.parser.header.RomHeaderParser

private const val HEADER_START = 0
private const val HEADER_END = 16

internal interface RomParser {

    fun parse(romStream: RomStream): RomData
}

internal class RomParserImpl(
    private val romHeaderParser: RomHeaderParser,
) : RomParser {

    override fun parse(romStream: RomStream): RomData {
        return RomData(
            header = romHeaderParser.parse(romStream.bytes.subList(HEADER_START, HEADER_END)),
        )
    }
}
