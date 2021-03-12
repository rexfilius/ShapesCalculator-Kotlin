package com.github.rexfilius.shapescalculatorkotlin.models

import com.github.rexfilius.shapescalculatorkotlin.screens.INVALID_DATA

class Parallelogram : Shape() {

    private lateinit var parallelogram: Parallelogram

    private fun getArea() = baseLength * height

    private fun getPerimeter() = 2 * (baseLength + sideLength)

    fun calculateArea() {
        parallelogram = Parallelogram()
        while (true) {
            try {
                println("Type in the BaseLength of the Parallelogram")
                val arg1 = readLine()!!.toDouble()
                parallelogram.baseLength = arg1
                println("BaseLength: $arg1")

                println("Type in the Height of the Parallelogram")
                val arg2 = readLine()!!.toDouble()
                parallelogram.height = arg2
                println("Height: $arg2")

                println("Area of parallelogram: ${parallelogram.getArea()}")
                break
            } catch (e: NumberFormatException) {
                println(INVALID_DATA)
            }
        }
    }

    fun calculatePerimeter() {
        parallelogram = Parallelogram()
        while (true) {
            try {
                println("Type in the BaseLength of the Parallelogram")
                val arg1 = readLine()!!.toDouble()
                parallelogram.baseLength = arg1
                println("BaseLength: $arg1")

                println("Type in the SideLength of the Parallelogram")
                val arg2 = readLine()!!.toDouble()
                parallelogram.sideLength = arg2
                println("SideLength: $arg2")

                println("Perimeter of Parallelogram: ${parallelogram.getPerimeter()}")
                break
            } catch (e: NumberFormatException) {
                println(INVALID_DATA)
            }
        }
    }

}