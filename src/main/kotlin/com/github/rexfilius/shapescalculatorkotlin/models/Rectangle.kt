package com.github.rexfilius.shapescalculatorkotlin.models

import com.github.rexfilius.shapescalculatorkotlin.screens.INVALID_DATA

class Rectangle : Shape() {

    private lateinit var rectangle: Rectangle

    override fun area() = length * breadth

    override fun perimeter() = 2 * (length * breadth)

    override fun calculateArea() {
        rectangle = Rectangle()
        while (true) {
            try {
                getLengthAndBreadth()
                println("Area of Rectangle: ${rectangle.area()}")
                break
            } catch (e: NumberFormatException) {
                println(INVALID_DATA)
            }
        }
    }

    override fun calculatePerimeter() {
        rectangle = Rectangle()
        while (true) {
            try {
                getLengthAndBreadth()
                println("Perimeter of Rectangle: ${rectangle.perimeter()}")
                break
            } catch (e: NumberFormatException) {
                println(INVALID_DATA)
            }
        }
    }

    private fun getLengthAndBreadth() {
        println("Type in the Length of the Rectangle")
        val arg1 = readln().toDouble()
        rectangle.length = arg1
        println("Length: $arg1")

        println("Type in the Breadth of the Rectangle")
        val arg2 = readln().toDouble()
        rectangle.breadth = arg2
        println("Breadth: $arg2")
    }
}