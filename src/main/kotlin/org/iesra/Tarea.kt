package org.iesra

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun obtenerFecha(): String {
    val fechaNoFormato = LocalDateTime.now()
    val formateadorFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")
    val fechaFormato = fechaNoFormato.format(formateadorFecha)
    return fechaFormato
}

class Tarea(val descripcion: String, var estado: EstadoTarea = EstadoTarea.Pendiente) {
    companion object {
        var contador = 0
    }
    var id = contador

    var fechaRealizacion: String? = null
    override fun toString(): String {
        return "Tarea $id. Descripción: ${this.descripcion} Estado: ${this.estado}"
    }
    init {
        contador++
        if (this.estado == EstadoTarea.Realizada) fechaRealizacion = obtenerFecha()
    }
    fun actualizarEstado(fechaRealizacion: String) {
        if (this.estado == EstadoTarea.Pendiente) {
            this.estado = EstadoTarea.Realizada
            this.fechaRealizacion = fechaRealizacion
        } else {
            this.estado = EstadoTarea.Pendiente
            this.fechaRealizacion = null
        }
    }
}