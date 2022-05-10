package com.github.rexfilius.shapescalculatorkotlin.screens

import com.github.rexfilius.shapescalculatorkotlin.models.ShapeList

const val INVALID_INPUT = "\nERROR! - Invalid Input\n"
const val INVALID_CASING = "\nCHECK YOUR CASING/WORDS. TYPE CORRECTLY\n"

private var select: String = ""
var parameter: String = ""

var selectedShape = 0;
var selectedCalculation = 0;

val calculationMenu = mapOf(
    1 to "Area",
    2 to "Perimeter",
)

val shapeMenu = mapOf(
    1 to ShapeList.Triangle,
    2 to ShapeList.Circle,
    3 to ShapeList.Square,
    4 to ShapeList.Rectangle,
    5 to ShapeList.Parallelogram,
    6 to ShapeList.Trapezium,
)

fun menuToSelectShape(): ShapeList? {
    val firstMessage = """
        This Application Calculates The Area And Perimeter Of 2-Dimensional Shapes
        Type in a NUMBER corresponding to the SHAPE
        """
    println(firstMessage)
    for ((key, value) in shapeMenu) {
        println("$key - $value")
    }

    try {
        selectedShape = readln().toInt()
        checkMenuToSelectShape()
        return shapeMenu[selectedShape]
    } catch (e: Exception) {
        // NumberFormatException
        print(INVALID_INPUT)
        menuToSelectShape()
    }
    return null
}

fun checkMenuToSelectShape() {
    while (!(shapeMenu.containsKey(selectedShape))) {
        println("\nPlease type in the NUMBER corresponding with the SHAPE\n")
        menuToSelectShape()
    }
}

fun menuToSelectMeasurement(): Int {
    println("What do you want to calculate:")
    var measurement = 0
    for (measure in calculationMenu.entries) {
        println("${measure.key} - ${measure.value}")
    }

    try {
        selectedCalculation = readln().toInt()
        checkMenuToSelectMeasurement()
        measurement = selectedCalculation
    } catch (e: Exception) {
        println(INVALID_INPUT);
        menuToSelectMeasurement();
    }
    return measurement
}

fun checkMenuToSelectMeasurement() {
    while (!(calculationMenu.containsKey(selectedCalculation))) {
        println("\nPlease type in the corresponding NUMBER\n")
        menuToSelectMeasurement()
    }
}

fun menuToContinueOrEnd() {
    println("\nPress 1 to go back to MENU\nPress 2 to END")
    try {
        when (readln().toInt()) {
            1 -> runCalculator()
            2 -> println("End of Program\n")
            else -> {
                println("Invalid Input")
                menuToContinueOrEnd()
            }
        }
    } catch (e: NumberFormatException) {
        println("\nInvalid Input\n")
        menuToContinueOrEnd()
    }
}

fun firstMenu(): String {
    val firstMessage = """
            This Application Calculates The Area And Perimeter Of 2-Dimensional Shapes
            List of Shapes: [Triangle, Circle, Square, Rectangle, Parallelogram, Trapezium]
            Select a Shape: [Type it in]
            """.trimIndent()
    println(firstMessage)
    select = readln()
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
    parameter = readln()
    checkSecondMenu()
    return parameter
}

private fun checkSecondMenu() {
    while (!(parameter == "Area" || parameter == "Perimeter")) {
        println(INVALID_CASING)
        secondMenu()
    }
}

fun thirdMenu() {
    println("\nPress 1 to go back to MENU\nPress 2 to END")
    try {
        when (readln().toInt()) {
            1 -> runCalculator()
            2 -> println("End of Program\n")
            else -> {
                println("Invalid Input")
                thirdMenu()
            }
        }
    } catch (e: NumberFormatException) {
        println("\nInvalid Input\n")
        thirdMenu()
    }
}
