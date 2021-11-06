package com.github.rexfilius.shapescalculatorkotlin.models

import com.github.rexfilius.shapescalculatorkotlin.screens.INVALID_DATA

class Parallelogram : Shape() {

    private lateinit var parallelogram: Parallelogram

    override fun area() = baseLength * height

    override fun perimeter() = 2 * (baseLength + sideLength)

    override fun calculateArea() {
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

                println("Area of parallelogram: ${parallelogram.area()}")
                break
            } catch (e: NumberFormatException) {
                println(INVALID_DATA)
            }
        }
    }

    override fun calculatePerimeter() {
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

                println("Perimeter of Parallelogram: ${parallelogram.perimeter()}")
                break
            } catch (e: NumberFormatException) {
                println(INVALID_DATA)
            }
        }
    }

}