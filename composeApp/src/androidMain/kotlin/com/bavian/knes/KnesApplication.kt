package com.bavian.knes

import android.app.Application
import com.bavian.knes.di.KoinInteractor
import org.koin.android.ext.koin.androidContext

class KnesApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        KoinInteractor.start {
            androidContext(this@KnesApplication)
        }
    }
}