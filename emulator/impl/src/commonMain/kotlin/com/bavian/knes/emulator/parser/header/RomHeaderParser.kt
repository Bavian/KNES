package com.bavian.knes.emulator.parser.header

import com.bavian.knes.emulator.data.RomHeader
import com.bavian.knes.emulator.parser.header.flags.Flags10Parser
import com.bavian.knes.emulator.parser.header.flags.Flags6Parser
import com.bavian.knes.emulator.parser.header.flags.Flags7Parser
import com.bavian.knes.emulator.parser.header.flags.Flags8Parser
import com.bavian.knes.emulator.parser.header.flags.Flags9Parser

internal interface RomHeaderParser {

    fun parse(bytes: List<Byte>): RomHeader
}

internal class RomHeaderParserImpl(
    private val nesParser: NesParser,
    private val flags6Parser: Flags6Parser,
    private val flags7Parser: Flags7Parser,
    private val flags8Parser: Flags8Parser,
    private val flags9Parser: Flags9Parser,
    private val flags10Parser: Flags10Parser,
) : RomHeaderParser {

    override fun parse(bytes: List<Byte>): RomHeader {
        val iterator = bytes.listIterator()
        return RomHeader(
            nes = nesParser.parse(iterator.next(), iterator.next(), iterator.next(), iterator.next()),
            prgRomSize = iterator.next(),
            chrRomSize = iterator.next(),
            flags6 = flags6Parser.parse(iterator.next()),
            flags7 = flags7Parser.parse(iterator.next()),
            flags8 = flags8Parser.parse(iterator.next()),
            flags9 = flags9Parser.parse(iterator.next()),
            flags10 = flags10Parser.parse(iterator.next()),
        )
    }
}
