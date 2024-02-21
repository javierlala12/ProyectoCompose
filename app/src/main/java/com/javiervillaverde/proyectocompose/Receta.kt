package com.javiervillaverde.proyectocompose

data class Receta(
    val titulo: String,
    val descripcion: String,
    val ingredientes: List<String>,
    val imagenUrl: String
)

