package org.iesra

fun main() {
    val cuentas = arrayOf(
        Cuenta("1234", .0),
        Cuenta("4321",700.0),
        null
    )
    val pepe = Persona(cuentas,"123456789A")
    for (cuenta in pepe.listaCuentas) if(cuenta != null) println(cuenta)
    println("Pago:")
    pepe.listaCuentas[0]?.recibirAbono(1100.0)
    pepe.listaCuentas[1]?.realizarPago(750.0)
    for (cuenta in pepe.listaCuentas) if(cuenta != null) println(cuenta)
    if (Cuenta.esMorosa(pepe)) println("La persona es morosa") else println("La persona NO es morosa7")
    Cuenta.transferencia(pepe,pepe,pepe.listaCuentas[0],pepe.listaCuentas[1], 250.0)
    for (cuenta in pepe.listaCuentas) if(cuenta != null) println(cuenta)
}