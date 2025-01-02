package com.nei.gallery

import android.os.Build

object AndroidPlatform : Platform {
    override val name: String = "Android ${Build.VERSION.RELEASE} (${Build.VERSION.SDK_INT})"
}

actual fun getPlatform(): Platform = AndroidPlatform