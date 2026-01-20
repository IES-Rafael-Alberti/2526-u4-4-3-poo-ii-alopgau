package org.iesra

class Cuenta(val numCuenta: String, var saldo: Double) {
    override fun toString(): String {
        return "Cuenta ${numCuenta} con saldo ${saldo}"
    }
    companion object {
        fun esMorosa(persona: Persona): Boolean {
            for (cuenta in persona.listaCuentas) {
                if (cuenta != null && cuenta.saldo < 0) {
                    return true

                }
            }
            return false
        }


        fun transferencia(personaA: Persona, personaB: Persona, cuentaA: Cuenta?, cuentaB: Cuenta?, cantidad: Double): Boolean {
        if (cuentaA != null && cuentaA in personaA.listaCuentas && cuentaB != null && cuentaB in personaB.listaCuentas && cuentaA.saldo >= cantidad) {
            cuentaA.saldo -= cantidad
            cuentaB.saldo += cantidad
            return true
        }
            return false
        }

    }
    fun consultarSaldo(): Double {
        return this.saldo
    }
    fun recibirAbono(cantidad: Double) {
        this.saldo += cantidad
    }
    fun realizarPago(cantidad: Double) {
        this.saldo -= cantidad
    }
}
