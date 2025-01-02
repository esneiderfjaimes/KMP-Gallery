package com.nei.gallery

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform