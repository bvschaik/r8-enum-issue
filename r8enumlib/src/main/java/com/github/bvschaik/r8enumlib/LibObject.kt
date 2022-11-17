package com.github.bvschaik.r8enumlib

import androidx.annotation.Keep

@Keep
class LibObject {
    private val direction = Direction.NORTH

    fun print() {
        println(direction)
    }
}
