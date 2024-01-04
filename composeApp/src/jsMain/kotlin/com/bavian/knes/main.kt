package com.bavian.knes

import com.bavian.knes.di.KoinInteractor
import com.bavian.knes.platform.Greeting
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.renderComposable

private const val ID_ROOT = "root"

fun main() {
    val koinApplication = KoinInteractor.start()
    val greeting = koinApplication.koin.get<Greeting>()

    renderComposable(rootElementId = ID_ROOT) {
        Text(greeting.greet)
    }
}