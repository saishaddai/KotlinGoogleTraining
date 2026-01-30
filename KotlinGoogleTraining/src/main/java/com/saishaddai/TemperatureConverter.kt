package com.saishaddai

/**
 * There are three main temperature scales used in the world: Celsius, Fahrenheit, and Kelvin.
 *
 * In the initial code provided in the following code snippet, write a program that converts a temperature from one scale to another with these formulas:
 *
 * Celsius to Fahrenheit: ° F = 9/5 (° C) + 32
 * Kelvin to Celsius: ° C = K - 273.15
 * Fahrenheit to Kelvin: K = 5/9 (° F - 32) + 273.15
 * Note that the String.format("%.2f", /* measurement */ ) method is used to convert a number into a String type with 2 decimal places.
 *
 * Complete the main() function so that it calls the printFinalTemperature() function and prints the following lines. You need to pass arguments for the temperature and conversion formula. Hint: you may want to use Double values to avoid Integer truncation during division operations.
 *
 *
 * 27.0 degrees Celsius is 80.60 degrees Fahrenheit.
 * 350.0 degrees Kelvin is 76.85 degrees Celsius.
 * 10.0 degrees Fahrenheit is 260.93 degrees Kelvin.
 */

fun main() {
    val celsiusToFahrenheit : (Double) -> Double = { c -> ((1.8) * c ) + 32 }

    printFinalTemperature(initialMeasurement = 27.0,
        initialUnit = "Celsius",
        finalUnit = "Fahrenheit",
        conversionFormula = celsiusToFahrenheit)

    val kelvinToCelsius : (Double) -> Double = { k -> k - 273.15 }

    printFinalTemperature(initialMeasurement = 350.0,
        initialUnit = "Kelvin",
        finalUnit = "Celsius",
        conversionFormula = kelvinToCelsius)

    val fahrenheitToKelvin : (Double) -> Double = { f -> ((f + 459.67) * 5) / 9}

    printFinalTemperature(initialMeasurement = 10.0,
        initialUnit = "Fahrenheit",
        finalUnit = "Kelvin",
        conversionFormula = fahrenheitToKelvin)
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}