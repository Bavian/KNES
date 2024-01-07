package com.bavian.knes.emulator.memory.impl.di

import com.bavian.knes.emulator.memory.api.EmulatorMemoryInteractor
import com.bavian.knes.emulator.memory.impl.EmulatorMemoryInteractorImpl
import com.bavian.knes.emulator.memory.impl.data.EmulatorMemoryRepository
import com.bavian.knes.emulator.memory.impl.data.EmulatorMemoryRepositoryImpl
import com.bavian.knes.emulator.memory.impl.data.cache.EmulatorMemoryCache
import com.bavian.knes.emulator.memory.impl.data.cache.EmulatorMemoryCacheImpl
import com.bavian.knes.emulator.memory.impl.domain.calculation.AbsAddressCalculator
import com.bavian.knes.emulator.memory.impl.domain.calculation.AbsAddressCalculatorImpl
import com.bavian.knes.emulator.memory.impl.domain.calculation.Zp0AddressCalculator
import com.bavian.knes.emulator.memory.impl.domain.calculation.Zp0AddressCalculatorImpl
import org.koin.core.module.dsl.factoryOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

@Suppress("FunctionName")
fun EmulatorMemoryModule() = module {
    singleOf(::EmulatorMemoryCacheImpl) bind EmulatorMemoryCache::class
    factoryOf(::EmulatorMemoryRepositoryImpl) bind EmulatorMemoryRepository::class
    factoryOf(::EmulatorMemoryInteractorImpl) bind EmulatorMemoryInteractor::class

    factoryOf(::AbsAddressCalculatorImpl) bind AbsAddressCalculator::class
    factoryOf(::Zp0AddressCalculatorImpl) bind Zp0AddressCalculator::class
}
