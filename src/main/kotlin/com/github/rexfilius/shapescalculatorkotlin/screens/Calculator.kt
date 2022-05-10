package com.github.rexfilius.shapescalculatorkotlin.screens

import com.github.rexfilius.shapescalculatorkotlin.models.ShapeList
import com.github.rexfilius.shapescalculatorkotlin.models.measureShape
import com.github.rexfilius.shapescalculatorkotlin.models.shape.*

fun runCalculator2() {
    val selectedMeasurement: Int
    when(menuToSelectShape()) {
        ShapeList.Triangle -> {
            selectedMeasurement = menuToSelectMeasurement()
            measureShape(selectedMeasurement, Triangle())
        }
        ShapeList.Circle -> {
            selectedMeasurement = menuToSelectMeasurement()
            measureShape(selectedMeasurement, Circle())
        }
        ShapeList.Square -> {
            selectedMeasurement = menuToSelectMeasurement()
            measureShape(selectedMeasurement, Square())
        }
        ShapeList.Rectangle -> {
            selectedMeasurement = menuToSelectMeasurement()
            measureShape(selectedMeasurement, Rectangle())
        }
        ShapeList.Parallelogram -> {
            selectedMeasurement = menuToSelectMeasurement()
            measureShape(selectedMeasurement, Parallelogram())
        }
        ShapeList.Trapezium -> {
            selectedMeasurement = menuToSelectMeasurement()
            measureShape(selectedMeasurement, Trapezium())
        }
        else -> return
    }
    menuToContinueOrEnd()
}

fun runCalculator() {
    val selectInput: String
    when (firstMenu()) {

        "Triangle" -> {
            selectInput = secondMenu()
            if (selectInput == "Area") Triangle().calculateArea()
            else Triangle().calculatePerimeter()
        }

        "Circle" -> {
            selectInput = secondMenu()
            if (selectInput == "Area") Circle().calculateArea()
            else Circle().calculatePerimeter()
        }

        "Square" -> {
            selectInput = secondMenu()
            if (selectInput == "Area") Square().calculateArea()
            else Square().calculatePerimeter()
        }

        "Rectangle" -> {
            selectInput = secondMenu()
            if (selectInput == "Area") Rectangle().calculateArea()
            else Rectangle().calculatePerimeter()
        }

        "Parallelogram" -> {
            selectInput = secondMenu()
            if (selectInput == "Area") Parallelogram().calculateArea()
            else Parallelogram().calculatePerimeter()
        }

        "Trapezium" -> {
            selectInput = secondMenu()
            if (selectInput == "Area") Trapezium().calculateArea()
            else Trapezium().calculatePerimeter()
        }

    }
    thirdMenu()
}