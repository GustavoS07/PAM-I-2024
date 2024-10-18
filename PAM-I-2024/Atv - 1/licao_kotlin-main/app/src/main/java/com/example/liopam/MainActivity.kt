package com.example.liopam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.liopam.ui.theme.LioPAMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LioPAMTheme {
                Surface(
                    color = MaterialTheme.colorScheme.background,
                    modifier = Modifier.fillMaxSize()
                ) {
                    GreetingImage(
                        message = "2º Novotec...",
                        novo = "Desenvolvimento de Sistemas AMS"
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String, novo: String) {
    Text(
        text = message,
        fontSize = 70.sp,
        lineHeight = 60.sp,
        textAlign = TextAlign.Center,
        color = Color.Black,
        modifier = Modifier
            .padding(top = 0.dp)
            .padding(start = 30.dp)
    )
    Text(
        text = novo,
        fontSize = 30.sp,
        lineHeight = 27.sp,
        textAlign = TextAlign.Center,
        color = Color.Black,
        modifier = Modifier
            .padding(top = 750.dp)
            .padding(end = 0.dp)
    )
}

@Composable
fun GreetingImage(message: String, novo: String, modifier: Modifier = Modifier) {
    val imagem = painterResource(R.drawable.vegeta)
    Box(modifier) {
        Image(
            painter = imagem,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 1.0F
        )
        GreetingText(
            message = message,
            novo = novo
        )
    }
}

@Preview(showBackground = true)
@Composable
fun LioPAMCardPreview() {
    LioPAMTheme {
        GreetingImage(
            message = "2º Novotec...",
            novo = "Desenvolvimento de Sistemas AMS"
        )
    }
}