package com.bavian.knes.emulator.memory.impl.domain.calculation

private const val ZP0_START = 0
private const val ZP0_END = 255

internal interface Zp0AddressCalculator {

    fun calculate(shift: Byte): Int
}

internal class Zp0AddressCalculatorImpl : Zp0AddressCalculator {

    override fun calculate(shift: Byte) = ZP0_START + shift
}
