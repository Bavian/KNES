package com.bavian.knes.emulator.memory.impl.domain.calculation

internal interface AbsAddressCalculator {

    fun calculate(firstHalf: Byte, secondHalf: Byte): Int
}

internal class AbsAddressCalculatorImpl : AbsAddressCalculator {


    override fun calculate(firstHalf: Byte, secondHalf: Byte) = firstHalf * 256 + secondHalf
}
