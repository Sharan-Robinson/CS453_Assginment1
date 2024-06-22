package edu.csueb.android.temperature

object ConverterUtil {
    // converts to Celsius
    fun convertFahrenheitToCelsius(fahrenheit: Float): Float {
        return ((fahrenheit - 32) * 5 / 9)
    }

    // converts to fahrenheit
    fun convertCelsiusToFahrenheit(celsius: Float): Float {
        return ((celsius * 9) / 5) + 32
    }
}