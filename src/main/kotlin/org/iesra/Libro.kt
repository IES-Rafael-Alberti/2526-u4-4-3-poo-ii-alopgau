package org.iesra

class Libro(val titulo: String, val autor: String, val paginas: Int, var nota: Int) {
    override fun toString(): String {
        return "Título: ${this.titulo} Autor: ${this.autor} Páginas: ${paginas} Nota: ${nota}"
    }
    init {
    require(nota > 0 && nota < 10)
}
}
