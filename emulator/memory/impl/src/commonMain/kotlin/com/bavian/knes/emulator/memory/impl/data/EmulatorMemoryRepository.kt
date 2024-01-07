package com.bavian.knes.emulator.memory.impl.data

import com.bavian.knes.emulator.memory.impl.data.cache.EmulatorMemoryCache

internal interface EmulatorMemoryRepository {

    fun get(index: Int): Result<Byte>

    fun reset()
}

internal class EmulatorMemoryRepositoryImpl(
    private val cache: EmulatorMemoryCache,
) : EmulatorMemoryRepository {

    override fun get(index: Int) = cache[index]

    override fun reset() = cache.reset()
}
