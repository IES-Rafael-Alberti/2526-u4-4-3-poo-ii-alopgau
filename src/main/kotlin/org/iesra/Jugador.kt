package org.iesra

class Jugador(val nombre: String) {
    companion object {
        private var contador = 0
        private const val max_jugadores = 2
    }
    val ficha = elegirFicha()
    val id = contador
    init {
        contador++
        require(contador < max_jugadores) {"Solo se permite un máximo de 2 jugadores"}
    }
    fun elegirFicha() {
        require(this.id == 1) {"Solo el jugador 1 puede seleccionar ficha"}
        do {
            println("El jugador 1 (${this.nombre}) eligirá su ficha (CIRCULO o CRUZ)")
            var entrada = readln().uppercase()
            if (entrada != "CIRCULO" || entrada != "CRUZ") println("Elige una ficha entre CIRCULO o CRUZ")
        }  while (entrada != "CIRCULO" || entrada != "CRUZ")


    }
}