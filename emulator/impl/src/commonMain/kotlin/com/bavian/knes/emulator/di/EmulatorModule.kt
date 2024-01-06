package com.bavian.knes.emulator.di

import com.bavian.knes.emulator.EmulatorInteractorImpl
import com.bavian.knes.emulator.api.EmulatorInteractor
import com.bavian.knes.emulator.parser.RomParser
import com.bavian.knes.emulator.parser.RomParserImpl
import com.bavian.knes.emulator.parser.header.NesParser
import com.bavian.knes.emulator.parser.header.NesParserImpl
import com.bavian.knes.emulator.parser.header.RomHeaderParser
import com.bavian.knes.emulator.parser.header.RomHeaderParserImpl
import com.bavian.knes.emulator.parser.header.flags.Flags10Parser
import com.bavian.knes.emulator.parser.header.flags.Flags10ParserImpl
import com.bavian.knes.emulator.parser.header.flags.Flags10TvSystemMapper
import com.bavian.knes.emulator.parser.header.flags.Flags10TvSystemMapperImpl
import com.bavian.knes.emulator.parser.header.flags.Flags6Parser
import com.bavian.knes.emulator.parser.header.flags.Flags6ParserImpl
import com.bavian.knes.emulator.parser.header.flags.Flags7Parser
import com.bavian.knes.emulator.parser.header.flags.Flags7ParserImpl
import com.bavian.knes.emulator.parser.header.flags.Flags8Parser
import com.bavian.knes.emulator.parser.header.flags.Flags8ParserImpl
import com.bavian.knes.emulator.parser.header.flags.Flags9Parser
import com.bavian.knes.emulator.parser.header.flags.Flags9ParserImpl
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.bind
import org.koin.dsl.module

@Suppress("FunctionName")
fun EmulatorModule() = module {
    factoryOf(::EmulatorInteractorImpl) bind EmulatorInteractor::class

    factoryOf(::RomParserImpl) bind RomParser::class
    factoryOf(::RomHeaderParserImpl) bind RomHeaderParser::class
    factoryOf(::NesParserImpl) bind NesParser::class
    factoryOf(::Flags6ParserImpl) bind Flags6Parser::class
    factoryOf(::Flags7ParserImpl) bind Flags7Parser::class
    factoryOf(::Flags8ParserImpl) bind Flags8Parser::class
    factoryOf(::Flags9ParserImpl) bind Flags9Parser::class
    factoryOf(::Flags10ParserImpl) bind Flags10Parser::class
    factoryOf(::Flags10TvSystemMapperImpl) bind Flags10TvSystemMapper::class
}
