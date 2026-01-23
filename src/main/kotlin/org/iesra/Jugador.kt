package org.iesra

class Jugador(val nombre: String) {
    companion object {
        private var contador = 0
        private const val max_jugadores = 2
    private val fichas = arrayOf<Ficha?>(Ficha.CRUZ, Ficha.CIRCULO)
    }

    val id = contador+1
    val ficha = elegirFicha()

    init {
        contador++
        require(contador <= max_jugadores) { "Solo se permite un máximo de 2 jugadores" }
    }

    private fun elegirFicha(): Ficha {

        if (this.id == 1) {
            var entrada: String
            do {
                println("El jugador 1 (${this.nombre}) eligirá su ficha (CIRCULO o CRUZ)")
                entrada = readln().uppercase()
                if (entrada != "CIRCULO" && entrada != "CRUZ") println("Elige una ficha entre CIRCULO o CRUZ")
            } while (entrada != "CIRCULO" && entrada != "CRUZ")
            when (entrada) {
                "CIRCULO" -> {
                    fichas[1] = null
                    return Ficha.CIRCULO
                }

                "CRUZ" -> {
                    fichas[0] = null
                    return Ficha.CRUZ
                } else -> throw IllegalArgumentException("Entrada invalida")
            }

        } else {
            return fichas.filterNotNull().first()
        }
    }
    private fun esCasillaOcupada(): Boolean {
        println("Esta casilla está ocupada")
        return false
    }

    fun jugarTurno(tablero: Array<Array<Ficha?>>) {
        var entrada = -1
        var valido = true
        do {
            println("Jugador ${id} (${nombre}).Introduce el número de la casilla que vas a jugar (1 al 9)")
            entrada = readln().toIntOrNull()?:-1
        when (entrada) {

            1 -> if(tablero[0][0] == null)tablero[0][0]  = this.ficha else valido = esCasillaOcupada()
            2 -> if(tablero[0][1] == null)tablero[0][1]  = this.ficha else valido = esCasillaOcupada()
            3 -> if(tablero[0][2] == null)tablero[0][2]  = this.ficha else valido = esCasillaOcupada()
            4 -> if(tablero[1][0] == null)tablero[1][0]  = this.ficha else valido = esCasillaOcupada()
            5 -> if(tablero[1][1] == null)tablero[1][1]  = this.ficha else valido = esCasillaOcupada()
            6 -> if(tablero[1][2] == null)tablero[1][2]  = this.ficha else valido = esCasillaOcupada()
            7 -> if(tablero[2][0] == null)tablero[2][0]  = this.ficha else valido = esCasillaOcupada()
            8 -> if(tablero[2][1] == null)tablero[2][1]  = this.ficha else valido = esCasillaOcupada()
            9 -> if(tablero[2][2] == null)tablero[2][2]  = this.ficha else valido = esCasillaOcupada()
        }
        } while (entrada !in 1..9 || !valido)
    }
}
