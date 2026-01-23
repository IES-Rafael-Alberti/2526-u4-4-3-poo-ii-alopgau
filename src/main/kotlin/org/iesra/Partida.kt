package org.iesra

import javax.print.attribute.standard.PrintQuality

class Partida (val j1: Jugador, val j2: Jugador) {
    companion object {
            val TABLERO = arrayOf<Array<Ficha?>>(
            arrayOfNulls<Ficha>(3),
            arrayOfNulls<Ficha>(3),
            arrayOfNulls<Ficha>(3)
            )
                 val casillasTablero = 9
    }
        var casillasOcupadas = 0

    fun jugarPartida() {
        var resultado = resultado(TABLERO)
    while (resultado == null) {
        j1.jugarTurno(TABLERO)
        resultado = resultado(TABLERO)
        this.casillasOcupadas++
        this.imprimirTablero(TABLERO)
        j2.jugarTurno(TABLERO)
        resultado = resultado(TABLERO)
        this.casillasOcupadas++
        this.imprimirTablero(TABLERO)
        }
        if (resultado == j1.ficha)println("El ganador es el jugador ${j1.id} ${(j1.nombre)}") else if (resultado == j2.ficha) println("El ganador es el jugador ${j2.id} ${(j2.nombre)}")
        }
    private fun imprimirTablero(tablero: Array<Array<Ficha?>>) {
        for (i in tablero.indices) {
            println(" ${tablero[i][0]?:" "} | ${tablero[i][1]?:" "} | ${tablero[i][2]?:" "} ")
            if (i < 2) println("-------------")
    }
        }

    private fun resultado(tablero: Array<Array<Ficha?>>): Ficha? {
            var i = 0
        while (i < tablero.size) {
            when {
                tablero[i].all {  it == Ficha.CRUZ } -> return Ficha.CRUZ
                tablero[i].all {  it == Ficha.CIRCULO } -> return Ficha.CIRCULO
                tablero[0][i] == Ficha.CIRCULO && tablero[1][i] == Ficha.CIRCULO && tablero[2][i] == Ficha.CIRCULO -> return Ficha.CIRCULO
                tablero[0][i] == Ficha.CRUZ && tablero[1][i] == Ficha.CRUZ && tablero[2][i] == Ficha.CRUZ -> return Ficha.CRUZ
                tablero[0][0] == Ficha.CRUZ && tablero [1][1] == Ficha.CRUZ && tablero[2][2] == Ficha.CRUZ -> return Ficha.CRUZ
                tablero[0][0] == Ficha.CIRCULO && tablero [1][1] == Ficha.CIRCULO && tablero[2][2] == Ficha.CIRCULO -> return Ficha.CIRCULO
                tablero[0][2] == Ficha.CIRCULO && tablero [1][1] == Ficha.CIRCULO && tablero[2][0] == Ficha.CIRCULO -> return Ficha.CIRCULO
                tablero[0][2] == Ficha.CRUZ && tablero [1][1] == Ficha.CRUZ && tablero[2][0] == Ficha.CRUZ -> return Ficha.CRUZ
                else -> i++
                    }
                }
                return null
            }
        }



