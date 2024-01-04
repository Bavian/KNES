package com.bavian.knes.platform

import android.os.Build

internal class PlatformAndroidImpl : Platform {

    override val name: String = "Android ${Build.VERSION.SDK_INT}"
}