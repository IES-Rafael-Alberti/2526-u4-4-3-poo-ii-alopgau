package org.iesra

fun main() {
    val l1 = Libro("El Quijote", "Cervantes", 800, 3)
    val l2 = Libro("El Señor de los Anillos", "J.R.R Tolkien", 450, 8)
    val libros = arrayOfNulls<Libro>(5)
    val conjunto = ConjuntoLibros(libros)
    println("Libros añadidos:")
    conjunto.anadirLibro(l1)
    conjunto.anadirLibro(l2)
    conjunto.mostrarTodo()
    conjunto.eliminarLibro(l1.titulo, l1.autor)
    conjunto.eliminarLibro(l2.titulo, l2.autor)
    val l3 = Libro("El camino de los reyes", "Brandon Sanderson", 756, 7)
    println("Libros eliminados")
    conjunto.anadirLibro(l3)
    conjunto.mostrarTodo()
}
