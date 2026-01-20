package org.iesra
fun leerEntrada(mensaje: String): String {
    print(mensaje)
    return readln()
}
fun main() {
    val lista = ListaTareas(mutableListOf<Tarea>())
    println("Elija una de las siguientes opciones. X para salir\n1) Añadir tarea\n2) Eliminar tarea\n3) Actualizar estado tarea\n4) Mostrar pendientes\n5)Mostrar realizadas\n6) Mostrar todas" )
    do {
        var entrada = readln()
        when (entrada) {
            "1" -> lista.anadirTarea(Tarea(leerEntrada("Introduce la descripción de la tarea")))
            "2" -> lista.eliminarTarea(leerEntrada("Introduce el ID de la tarea a eliminar").toIntOrNull()?:-1)
            "3" -> {
                val idBuscado = leerEntrada("Introduce el ID de la tarea a actualizar").toIntOrNull()?:-1
                val tareaActualizar = lista.listaTareas.firstOrNull {it.id == idBuscado}
                if (idBuscado != -1 && tareaActualizar != null) tareaActualizar.actualizarEstado(obtenerFecha())
            }
            "4" -> lista.listarPendientes()
            "5" -> lista.listarRealizadas()
            "6" -> lista.listarTareas()
        }
    } while (entrada != "X")
}