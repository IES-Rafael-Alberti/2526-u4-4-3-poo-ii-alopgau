package org.iesra

fun main() {
    val cuentas = arrayOf(
        Cuenta("0", .0),
        null,
        null
    )
    val pepe = Persona(cuentas,"123456789A")
    pepe.anadirCuenta(Cuenta("1234",.0))
    pepe.anadirCuenta(Cuenta("4321",700.0))

    for (cuenta in pepe.listaCuentas) if(cuenta != null) println(cuenta)
    println("Pago:")
    pepe.listaCuentas[0]?.recibirAbono(1100.0)
    pepe.listaCuentas[1]?.realizarPago(750.0)
    for (cuenta in pepe.listaCuentas) if(cuenta != null) println(cuenta)
    if (Cuenta.esMorosa(pepe)) println("La persona es morosa") else println("La persona NO es morosa")
    Cuenta.transferencia(pepe,pepe,pepe.listaCuentas[0],pepe.listaCuentas[1], 250.0)
    for (cuenta in pepe.listaCuentas) if(cuenta != null) println(cuenta)
}