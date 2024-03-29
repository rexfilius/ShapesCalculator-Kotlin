package com.github.rexfilius.shapescalculatorkotlin.models

interface Measurable {

    fun area(): Double
    fun perimeter(): Double

    fun calculateArea()
    fun calculatePerimeter()
}

enum class ShapeList {
    Triangle,
    Circle,
    Square,
    Rectangle,
    Parallelogram,
    Trapezium,
}