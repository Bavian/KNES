package com.bavian.knes.emulator.memory.impl.data.cache

private const val MEMORY_SIZE_KB = 64 * 1024

interface EmulatorMemoryCache {

    operator fun get(index: Int): Result<Byte>

    fun reset()
}

internal class EmulatorMemoryCacheImpl : EmulatorMemoryCache {

    private val memory = ByteArray(MEMORY_SIZE_KB)

    override fun get(index: Int): Result<Byte> {
        if (index !in memory.indices) {
            return Result.failure(IndexOutOfBoundsException("Index out of bound: $index"))
        }

        return Result.success(memory[index])
    }

    override fun reset() {
        memory.forEachIndexed { index, _ ->
            memory[index] = 0
        }
    }
}
