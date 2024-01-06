package com.bavian.knes.emulator.api.data

sealed interface RomStream {

    val bytes: List<Byte>

    private data class RomStreamImpl(
        override val bytes: List<Byte>,
    ) : RomStream

    companion object {

        operator fun invoke(
            bytes: Iterable<Byte>,
        ): RomStream = RomStreamImpl(
            bytes = bytes.toList(),
        )
    }
}
