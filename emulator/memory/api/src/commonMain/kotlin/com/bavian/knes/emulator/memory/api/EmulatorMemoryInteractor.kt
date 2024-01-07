package com.bavian.knes.emulator.memory.api

interface EmulatorMemoryInteractor {

    fun getABS(firstHalf: Byte, secondHalf: Byte): Result<Byte>

    fun getZP0(shift: Byte): Result<Byte>

    fun reset()
}
