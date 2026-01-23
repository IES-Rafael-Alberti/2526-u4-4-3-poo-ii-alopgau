package org.iesra
data class Compra(val cliente: Cliente, val dia: Int, val monto: Float) {

}
data class Domicilio(val calle: String, val numero: String) {
    fun dirCompleta(): Domicilio {
        return this
    }
}

data class Cliente(val nombre: String, val domicilio: Domicilio) {

}
class RepositorioCompras(val repositorioCompras: MutableSet<Compra>) {
    fun anadirCompra(compra: Compra) {
        repositorioCompras.add(compra)
    }
    fun domicilios(): MutableSet<Domicilio> {
        val domicilios = mutableSetOf<Domicilio>()
        for ((cliente,_,_) in repositorioCompras) {
        domicilios.add(cliente.domicilio)
        }
        return domicilios
    }

}


