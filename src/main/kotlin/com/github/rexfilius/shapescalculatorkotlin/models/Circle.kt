package com.github.rexfilius.shapescalculatorkotlin.models

import com.github.rexfilius.shapescalculatorkotlin.screens.INVALID_DATA

class Circle : Shape() {

    private lateinit var circle: Circle

    override fun area() = Math.PI * radius * radius

    override fun perimeter() = 2 * Math.PI * radius

    override fun calculateArea() {
        circle = Circle()
        while (true) {
            try {
                getRadiusOfCircle()
                println("Area of circle: ${circle.area()}")
                break
            } catch (e: NumberFormatException) {
                println(INVALID_DATA)
            }
        }
    }

    override fun calculatePerimeter() {
        circle = Circle()
        while (true) {
            try {
                getRadiusOfCircle()
                println("Perimeter of circle: ${circle.perimeter()}")
                break
            } catch (e: NumberFormatException) {
                println(INVALID_DATA)
            }
        }
    }

    private fun getRadiusOfCircle() {
        println("Type in the radius of the Circle")
        val arg = readln().toDouble()
        circle.radius = arg
        println("Radius: $arg")
    }

}