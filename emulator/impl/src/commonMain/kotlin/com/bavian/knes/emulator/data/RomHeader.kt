package com.bavian.knes.emulator.data

internal data class RomHeader(
    /** Constant $4E $45 $53 $1A (ASCII "NES" followed by MS-DOS end-of-file) */
    val nes: String,
    /** Size of PRG ROM in 16 KB units */
    val prgRomSize: Byte,
    /** Size of CHR ROM in 8 KB units (value 0 means the board uses CHR RAM)  */
    val chrRomSize: Byte,

    val flags6: Flags6,
    val flags7: Flags7,
    val flags8: Flags8,
    val flags9: Flags9,
    val flags10: Flags10,
)

/** Mapper, mirroring, battery, trainer */
internal data class Flags6(
    /**
     * false: horizontal (vertical arrangement) (CIRAM A10 = PPU A11)
     * true: vertical (horizontal arrangement) (CIRAM A10 = PPU A10)
     */
    val mirroring: Boolean,
    /** true: Cartridge contains battery-backed PRG RAM ($6000-7FFF) or other persistent memory */
    val persistentMemory: Boolean,
    /** 512-byte trainer at $7000-$71FF (stored before PRG data) */
    val byte512Trainer: Boolean,
    /** true: 512-byte trainer at $7000-$71FF (stored before PRG data) */
    val fourScreenVRam: Boolean,
    /** Lower nybble of mapper number */
    val lowerNybble: Byte,
)

/** Mapper, VS/Playchoice, NES 2.0 */
internal data class Flags7(
    /** VS Unisystem */
    val vsUnisystem: Boolean,
    /** PlayChoice-10 (8 KB of Hint Screen data stored after CHR data) */
    val playChoice10: Boolean,
    /** true: flags 8-15 are in NES 2.0 format */
    val nes20: Boolean,
    /** Upper nybble of mapper number */
    val upperNybble: Byte,
)

/** PRG-RAM size (rarely used extension) */
internal data class Flags8(
    val prgRamSize: Byte,
)

/** TV system (0: NTSC; 1: PAL)(rarely used extension) */
internal data class Flags9(
    val tvSystem: TvSystem,
) {

    enum class TvSystem { NTSC, PAL }
}

/** TV system, PRG-RAM presence (unofficial, rarely used extension) */
internal data class Flags10(
    /** TV system (0: NTSC; 2: PAL; 1/3: dual compatible) */
    val tvSystem: TvSystem,
    /** PRG RAM ($6000-$7FFF) (0: present; 1: not present) */
    val prgRam: Boolean,
    /** false: Board has no bus conflicts; true: Board has bus conflicts */
    val busConflicts: Boolean,
) {

    enum class TvSystem { NTSC, PAL, DualCompatible }
}
