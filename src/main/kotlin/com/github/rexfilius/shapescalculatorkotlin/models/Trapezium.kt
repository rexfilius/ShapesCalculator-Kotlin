package com.github.rexfilius.shapescalculatorkotlin.models

import com.github.rexfilius.shapescalculatorkotlin.screens.INVALID_DATA

class Trapezium : Shape() {

    private lateinit var trapezium: Trapezium

    override fun area() = (0.5 * (topLength + baseLength)) * height

    override fun perimeter() = topLength + baseLength + sideLength1 + sideLength2

    override fun calculateArea() {
        trapezium = Trapezium()
        while (true) {
            try {
                println("Type in the TopLength of the Trapezium")
                val arg1 = readLine()!!.toDouble()
                trapezium.topLength = arg1
                println("TopLength: $arg1")

                println("Type in the BaseLength of the Trapezium")
                val arg2 = readLine()!!.toDouble()
                trapezium.baseLength = arg2
                println("BaseLength: $arg2")

                println("Type in the Height of the Trapezium")
                val arg3 = readLine()!!.toDouble()
                trapezium.height = arg3
                println("Height: $arg3")

                println("Area of Trapezium: ${trapezium.area()}")
                break
            } catch (e: NumberFormatException) {
                println(INVALID_DATA)
            }
        }
    }

    override fun calculatePerimeter() {
        trapezium = Trapezium()
        while (true) {
            try {
                println("Type in the TopLength of the Trapezium")
                val arg1 = readLine()!!.toDouble()
                trapezium.topLength = arg1
                println("TopLength: $arg1")

                println("Type in the BaseLength of the Trapezium")
                val arg2 = readLine()!!.toDouble()
                trapezium.baseLength = arg2
                println("BaseLength: $arg2")

                println("Type in the SideLength-1 of the Trapezium")
                val arg3 = readLine()!!.toDouble()
                trapezium.sideLength1 = arg3
                println("SideLength-1: $arg3")

                println("Type in the SideLength-2 of the Trapezium")
                val arg4 = readLine()!!.toDouble()
                trapezium.sideLength1 = arg4
                println("SideLength-2: $arg4")

                println("Perimeter of Trapezium: ${trapezium.perimeter()}")
                break
            } catch (e: NumberFormatException) {
                println(INVALID_DATA)
            }
        }
    }

}