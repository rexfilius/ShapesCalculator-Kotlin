package com.github.rexfilius.shapescalculatorkotlin.models

import com.github.rexfilius.shapescalculatorkotlin.screens.INVALID_DATA

class Square : Shape() {

    private lateinit var square: Square

    override fun area() = sideLength * sideLength

    override fun perimeter() = 4 * sideLength

    override fun calculateArea() {
        square = Square()
        while (true) {
            try {
                getSideLength()
                println("Area of Square is: ${square.area()}")
                break
            } catch (e: NumberFormatException) {
                println(INVALID_DATA)
            }
        }
    }

    override fun calculatePerimeter() {
        square = Square()
        while (true) {
            try {
                getSideLength()
                println("Perimeter of Square: ${square.perimeter()}")
                break
            } catch (e: NumberFormatException) {
                println(INVALID_DATA)
            }
        }
    }

    private fun getSideLength() {
        println("Type in the SideLength of the Square")
        val arg = readLine()!!.toDouble()
        square.sideLength = arg
        println("SideLength: $arg")
    }
}