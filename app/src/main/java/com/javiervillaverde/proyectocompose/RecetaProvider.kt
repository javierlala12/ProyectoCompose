package com.javiervillaverde.proyectocompose

object RecetaProvider {
    val listaRecetas = listOf(
        Receta(titulo = "Macarrones a la boloñesa", descripcion = "Macarrones a la boloñesa", ingredientes = listOf("Macarrones", "Tomate","Carne","Cebolla"), imagenUrl = "https://imagenes.20minutos.es/files/image_640_360/uploads/imagenes/2021/09/14/macarrones.jpeg"),
        Receta(titulo = "Macarrones con chorizo", descripcion = "Macarrones con chorizo", ingredientes = listOf("Macarrones", "Tomate","Chorizo","Cebolla"), imagenUrl = "https://e00-xlk-cooking-elmundo.uecdn.es/files/image_960_655/uploads/2023/03/01/63fe92b5597d0.jpeg"),
        Receta(titulo = "Hamburguesa", descripcion = "Hamburguesa", ingredientes = listOf("Pan", "Queso","Carne","Cebolla"), imagenUrl = "https://www.beloleum.com/wp-content/uploads/2023/10/hamburguesas-caseras-gourmet.png"),
        Receta(titulo = "Pizza", descripcion = "Pizza", ingredientes = listOf("Masa de pizza", "Tomate","Peperoni"), imagenUrl = "https://w6h5a5r4.rocketcdn.me/wp-content/uploads/2019/06/pizza-con-chorizo-jamon-y-queso-1080x671.jpg")
    )
}
