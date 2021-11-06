package com.github.rexfilius.shapescalculatorkotlin.models

open class Shape: Measurable {

    var length = 0.0
    var breadth = 0.0
    var height = 0.0
    var sideLength = 0.0
    var sideLength1 = 0.0
    var sideLength2 = 0.0
    var topLength = 0.0
    var baseLength = 0.0
    var radius = 0.0

    override fun area(): Double {
        return 0.0
    }

    override fun perimeter(): Double {
        return 0.0
    }

    override fun calculateArea() {
        // No-op
    }

    override fun calculatePerimeter() {
        // No-op
    }
}