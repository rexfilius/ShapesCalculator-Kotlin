package com.github.rexfilius.shapescalculatorkotlin.models

import com.github.rexfilius.shapescalculatorkotlin.screens.INVALID_DATA

class Triangle: Shape() {

    private lateinit var triangle: Triangle

    private fun getArea() = 0.5 * (baseLength * height)

    private fun getPerimeter() = sideLength1 + sideLength2 + baseLength

    fun calculateArea() {
        triangle= Triangle()
        while(true) {
            try {
                println("Type in the BaseLength of the Triangle")
                val arg1 = readLine()!!.toDouble()
                triangle.baseLength = arg1
                println("BaseLength: $arg1")

                println("Type in the Height of the Triangle")
                val arg2 = readLine()!!.toDouble()
                triangle.height = arg2
                println("Height: $arg2")

                println("Area of Triangle: ${triangle.getArea()}")
                break
            } catch (e: NumberFormatException) {
                println(INVALID_DATA)
            }
        }
    }

    fun calculatePerimeter() {
        triangle = Triangle()
        while(true) {
            try {
                println("Type in the SideLength-1 of the Triangle")
                val arg1 = readLine()!!.toDouble()
                triangle.sideLength1 = arg1
                println("SideLength-1: $arg1")

                println("Type in the SideLength-2 of the Triangle")
                val arg2 = readLine()!!.toDouble()
                triangle.sideLength2 = arg2
                println("SideLength-2: $arg2")

                println("Type in the BaseLength of the Triangle")
                val arg3 = readLine()!!.toDouble()
                triangle.baseLength = arg3
                println("BaseLength: $arg3")

                println("Perimeter of Triangle: ${triangle.getPerimeter()}")
                break
            } catch (e: NumberFormatException) {
                println(INVALID_DATA)
            }
        }
    }
}