package org.iesra

class Cuenta(val numCuenta: String, var saldo: Double) {
    companion object {
        fun esMorosa(persona: Persona): Boolean {
            for (cuenta in persona.listaCuentas) {
                cuenta?.saldo?.let {
                    if (it < 0) {
                        return true
                    }
                }
            }
                return false
        }
        fun transferencia(emisor: Persona, receptor: Persona, idCuenta1: String, idCuenta2: String, cantidad: Double): Boolean {
            if (idCuenta1 in emisor.listaCuentas.map { it?.numCuenta  } && idCuenta2 in receptor.listaCuentas.map { it?.numCuenta }) {
                return true
            } else {

                return false
            }
        }
    }
    fun consultarSaldo(): Double {
        return this.saldo
    }
    fun recibirAbono(emisor: Cuenta, cantidad: Double) {
        emisor.saldo -= cantidad
        this.saldo += cantidad
    }
    fun realizarPago(receptor: Cuenta, cantidad: Double) {
        receptor.saldo += cantidad
        this.saldo -= cantidad
    }
}
