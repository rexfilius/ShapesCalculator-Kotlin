package com.github.rexfilius.shapescalculatorkotlin.models

import com.github.rexfilius.shapescalculatorkotlin.screens.INVALID_DATA

class Square : Shape() {

    private lateinit var square: Square

    private fun getArea() = sideLength * sideLength

    private fun getPerimeter() = 4 * sideLength

    fun calculateArea() {
        square = Square()
        while (true) {
            try {
                println("Type in the SideLength of the Square")
                val arg = readLine()!!.toDouble()
                square.sideLength = arg
                println("SideLength: $arg")

                println("Area of Square is: ${square.getArea()}")
                break
            } catch (e: NumberFormatException) {
                println(INVALID_DATA)
            }
        }
    }

    fun calculatePerimeter() {
        square = Square()
        while (true) {
            try {
                println("Type in the SideLength of the Square")
                val arg = readLine()!!.toDouble()
                square.sideLength = arg
                println("SideLength: $arg")

                println("Perimeter of Square: ${square.getPerimeter()}")
                break
            } catch (e: NumberFormatException) {
                println(INVALID_DATA)
            }
        }
    }
}