package com.github.rexfilius.shapescalculatorkotlin.screens

const val INVALID_DATA = "\nYOU ENTERED INVALID DATA\n"
const val INVALID_CASING = "\nCHECK YOUR CASING/WORDS. TYPE CORRECTLY\n"

class Screen {

    private var select: String = ""
    var parameter: String = ""

    fun firstMenu(): String {
        val firstMessage = """
            This Application Calculates The Area And Perimeter Of 2-Dimensional Shapes
            List of Shapes: [Triangle, Circle, Square, Rectangle, Parallelogram, Trapezium]
            Select a Shape: [Type it in]
            """.trimIndent()
        println(firstMessage)
        select = readLine()!!.toString()
        checkFirstMenu()
        return select
    }

    private fun checkFirstMenu() {
        while (!(select == "Circle" || select == "Triangle"
                    || select == "Square" || select == "Rectangle"
                    || select == "Parallelogram" || select == "Trapezium")
        ) {
            println(INVALID_CASING)
            firstMenu()
        }
    }

    fun secondMenu(): String {
        println("What do you want to calculate: Area? or Perimeter? [Type it in]")
        parameter = readLine()!!.toString()
        checkSecondMenu()
        return parameter
    }

    private fun checkSecondMenu() {
        while (!(parameter == "Area" || parameter == "Perimeter")) {
            println(INVALID_CASING)
            secondMenu()
        }
    }
}