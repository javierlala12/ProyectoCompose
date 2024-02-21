package com.javiervillaverde.proyectocompose
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter

val DarkYellow = Color(0xFFFBC02D)



@Composable
fun PantallaPrincipal() {
    LazyColumn {
        items(RecetaProvider.listaRecetas) { receta ->
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = DarkYellow,
                ),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                ),border = BorderStroke(1.dp, Color.Black),
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()

            ){

                val tituloSubrayado = buildAnnotatedString {
                    withStyle(style = SpanStyle(textDecoration = TextDecoration.Underline)) {
                        append(receta.titulo)
                    }
                }
                Text(
                    text = tituloSubrayado,
                    style = MaterialTheme.typography.headlineMedium,
                    modifier = Modifier
                        .padding(8.dp),
                )
                Image(
                    painter = rememberAsyncImagePainter(
                        model = receta.imagenUrl,
                        placeholder = painterResource(id = R.drawable.ic_launcher_foreground),
                        error = painterResource(id = R.drawable.ic_launcher_foreground)
                    ),
                    contentDescription = null,
                    modifier = Modifier.fillMaxWidth(),
                    contentScale = ContentScale.FillWidth
                )

                Text(
                    text = receta.descripcion,
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(8.dp)
                )
                Text(
                    text = "Ingredientes:",
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(8.dp)
                )
                receta.ingredientes.forEach { ingrediente ->
                    Text(
                        text = "- $ingrediente",
                        style = MaterialTheme.typography.bodySmall,
                        modifier = Modifier.padding(8.dp)
                    )
                }

            }
        }
    }
}

