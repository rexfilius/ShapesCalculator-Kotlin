package com.github.rexfilius.shapescalculatorkotlin.models

import com.github.rexfilius.shapescalculatorkotlin.screens.INVALID_DATA

class Circle : Shape() {

    private lateinit var circle: Circle

    private fun getArea() = Math.PI * radius * radius

    private fun getPerimeter() = 2 * Math.PI * radius

    fun calculateArea() {
        circle = Circle()
        while (true) {
            try {
                println("Type in the radius of the Circle")
                val arg = readLine()!!.toDouble()
                circle.radius = arg
                println("Radius: $arg")

                println("Area of circle: ${circle.getArea()}")
                break
            } catch (e: NumberFormatException) {
                println(INVALID_DATA)
            }
        }
    }

    fun calculatePerimeter() {
        circle = Circle()
        while (true) {
            try {
                println("Type in the radius of the Circle")
                val arg = readLine()!!.toDouble()
                circle.radius = arg
                println("Radius: $arg")

                println("Perimeter of circle: ${circle.getPerimeter()}")
                break
            } catch (e: NumberFormatException) {
                println(INVALID_DATA)
            }
        }
    }

}