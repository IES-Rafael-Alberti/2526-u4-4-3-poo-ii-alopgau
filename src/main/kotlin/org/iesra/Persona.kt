package org.iesra
class Persona(var listaCuentas: Array<Cuenta?>, val dni: String) {
    companion object {
        const val limiteCuentas = 3
    }
    var contadorCuenta = 0
    fun anadirCuenta(cuenta: Cuenta): Boolean {
        if (this.contadorCuenta < limiteCuentas) {
            this.listaCuentas[contadorCuenta] = cuenta
            this.contadorCuenta++
            return true
        }
        return false
    }
}