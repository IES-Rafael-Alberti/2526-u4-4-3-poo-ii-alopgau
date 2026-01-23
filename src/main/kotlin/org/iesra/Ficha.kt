package org.iesra

enum class Ficha {
    CRUZ, CIRCULO;

    override fun toString(): String {
        when (this) {
            CRUZ -> return "X"
            CIRCULO -> return "O"
        }
    }
}

