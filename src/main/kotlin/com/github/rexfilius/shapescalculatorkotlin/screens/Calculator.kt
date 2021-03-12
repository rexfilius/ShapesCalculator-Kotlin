package com.github.rexfilius.shapescalculatorkotlin.screens

import com.github.rexfilius.shapescalculatorkotlin.models.*

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