package org.iesra

fun main() {

   val jugador1 = Jugador("pepe")
   val jugador2 = Jugador("lucia")
  val partida = Partida(jugador1,jugador2)
   partida.jugarPartida()
}