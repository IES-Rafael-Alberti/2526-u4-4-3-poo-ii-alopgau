package org.iesra

class ConjuntoLibros(val conjunto: Array<Libro?>) {
    companion object {
        const val limiteLibros = 5
    }
    var contador = 0
    fun anadirLibro(libro: Libro): Boolean {
        if (contador < limiteLibros && null in this.conjunto) {
            conjunto[conjunto.indexOfFirst { it == null }] = libro
            this.contador++
            return true
        }
        return false

    }
    fun eliminarLibro(titulo: String, autor: String): Boolean {
        val libroBuscado = conjunto.indexOfFirst {it?.titulo == titulo && it.autor == autor }
        if (libroBuscado == -1) {
            return false
        } else {
            conjunto[libroBuscado] = null
            return true
        }

    }
fun mostrarMejoryPeor() {
    val peor = this.conjunto.filterNotNull().minByOrNull { it.nota }
    val mejor =this.conjunto.filterNotNull().maxByOrNull { it.nota }
    println(mejor)
    println(peor)
}
    fun mostrarTodo(): Unit {
        this.conjunto.filterNotNull().forEach { println(it) }
    }
}



