package com.github.rexfilius.shapescalculatorkotlin.models

import com.github.rexfilius.shapescalculatorkotlin.screens.INVALID_DATA

class Rectangle : Shape() {

    lateinit var rectangle: Rectangle

    fun getArea() = length * breadth

    fun getPerimeter() = 2 * (length * breadth)

    fun calculateArea() {
        rectangle = Rectangle()
        while (true) {
            try {
                println("Type in the Length of the Rectangle")
                val arg1 = readLine()!!.toDouble()
                rectangle.length = arg1
                println("Length: $arg1")

                println("Type in the Breadth of the Rectangle")
                val arg2 = readLine()!!.toDouble()
                rectangle.breadth = arg2
                println("Breadth: $arg2")

                println("Area of Rectangle: ${rectangle.getArea()}")
                break
            } catch (e: NumberFormatException) {
                println(INVALID_DATA)
            }
        }
    }

    fun calculatePerimeter() {
        rectangle = Rectangle()
        while (true) {
            try {
                println("Type in the Length of the Rectangle")
                val arg1 = readLine()!!.toDouble()
                rectangle.length = arg1
                println("Length: $arg1")

                println("Type in the Breadth of the Rectangle")
                val arg2 = readLine()!!.toDouble()
                rectangle.breadth = arg2
                println("Breadth: $arg2")

                println("Perimeter of Rectangle: ${rectangle.getPerimeter()}")
                break
            } catch (e: NumberFormatException) {
                println(INVALID_DATA)
            }
        }
    }
}