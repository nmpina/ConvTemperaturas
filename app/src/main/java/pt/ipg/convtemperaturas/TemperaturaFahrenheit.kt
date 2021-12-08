package pt.ipg.convtemperaturas

class TemperaturaFahrenheit (valor : Double) : Temperatura (valor) {
    override fun getFahrenheit(): Double {
        return  valor
    }

    override fun getCelsius(): Double {
        return (valor - 32.0) * 5.0 / 9.0
    }
}