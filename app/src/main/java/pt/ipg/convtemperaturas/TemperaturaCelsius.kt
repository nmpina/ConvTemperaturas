package pt.ipg.convtemperaturas

class TemperaturaCelsius(valor: Double) : Temperatura(valor) {
    override fun getFahrenheit(): Double {
        return  valor * 1.8 + 32.0
    }
    override fun getCelsius(): Double {
        return valor
    }
}