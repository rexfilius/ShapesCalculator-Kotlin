package com.github.rexfilius.shapescalculatorkotlin.models

class Square: Shape() {

    lateinit var square: Square

    fun getArea(): Double {
        return sideLength * sideLength
    }

    fun getPerimeter(): Double {
        return 4 * sideLength
    }
}