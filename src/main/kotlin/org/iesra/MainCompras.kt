package org.iesra

fun main() {
    val compras = RepositorioCompras(mutableSetOf<Compra>(
        Compra(Cliente("Nuria", Domicilio("Las Flores","355")),5, 12780.78F),
        Compra(Cliente("Nuria", Domicilio("Las Flores","355")),7, 532.90F),
        Compra(Cliente("Jorge", Domicilio("Mirasol","218")),7, 699F),
        Compra(Cliente("Julián", Domicilio("La Mancha","761")),12, 5715.99F),
        Compra(Cliente("Jorge", Domicilio("Mirasol","218")),15, 958F)))

println(compras.domicilios())
}