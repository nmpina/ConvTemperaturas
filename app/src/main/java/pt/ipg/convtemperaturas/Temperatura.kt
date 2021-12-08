package pt.ipg.convtemperaturas

abstract class Temperatura(val valor: Double) {
    abstract fun getFahrenheit(): Double
    abstract fun getCelsius(): Double
}