package com.bavian.knes.emulator.memory.impl

import com.bavian.knes.emulator.memory.api.EmulatorMemoryInteractor
import com.bavian.knes.emulator.memory.impl.data.EmulatorMemoryRepository
import com.bavian.knes.emulator.memory.impl.domain.calculation.AbsAddressCalculator
import com.bavian.knes.emulator.memory.impl.domain.calculation.Zp0AddressCalculator

internal class EmulatorMemoryInteractorImpl(
    private val repository: EmulatorMemoryRepository,
    private val absAddressCalculator: AbsAddressCalculator,
    private val zp0AddressCalculator: Zp0AddressCalculator,
) : EmulatorMemoryInteractor {

    override fun getABS(firstHalf: Byte, secondHalf: Byte) =
        repository.get(absAddressCalculator.calculate(firstHalf, secondHalf))

    override fun getZP0(shift: Byte) = repository.get(zp0AddressCalculator.calculate(shift))

    override fun reset() = repository.reset()
}
