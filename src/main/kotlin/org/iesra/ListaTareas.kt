package org.iesra

class ListaTareas(val listaTareas: MutableList<Tarea>) {

fun anadirTarea(tarea: Tarea) {
    this.listaTareas.add(tarea)
}
fun eliminarTarea(idtarea: Int): Boolean {
    if (idtarea == -1) return false
    val tareaBuscada = listaTareas.indexOfFirst {  it.id == idtarea  }
    if (tareaBuscada != -1) {
    this.listaTareas.removeAt(tareaBuscada)
    return true
    }
    return false
}
    fun listarTareas() {
        this.listaTareas.forEach { println(it) }
    }
    fun listarPendientes() {
        return println(this.listaTareas.filter { it.estado == EstadoTarea.Pendiente })
    }
    fun listarRealizadas() {
        return println(this.listaTareas.filter { it.estado == EstadoTarea.Realizada })
    }

}
