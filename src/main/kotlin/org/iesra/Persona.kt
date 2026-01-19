package org.iesra
class Persona(var listaCuentas: Array<Cuenta?>, val dni: String) {
    var cuentas = 0
        private set
    fun anadirCuenta(cuenta: Cuenta): Boolean {
        if (this.cuentas < 3) {
            listaCuentas[cuentas] = cuenta
            this.cuentas++
            return true
        }
        return false
    }
init {
    listaCuentas = arrayOfNulls<Cuenta>(3)
}
}