package com.bavian.knes.emulator.api

import com.bavian.knes.emulator.api.data.RomStream

interface EmulatorInteractor {

    fun load(romStream: RomStream)
}
