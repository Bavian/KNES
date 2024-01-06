package com.bavian.knes.emulator

import com.bavian.knes.core.utils.api.logger.Logger
import com.bavian.knes.emulator.api.EmulatorInteractor
import com.bavian.knes.emulator.api.data.RomStream
import com.bavian.knes.emulator.parser.RomParser

internal class EmulatorInteractorImpl(
    private val romParser: RomParser,
    private val logger: Logger,
) : EmulatorInteractor {

    override fun load(romStream: RomStream) {
        logger.log(Logger.Level.DEBUG, "EmulatorInteractor", romParser.parse(romStream).toString())
    }
}
