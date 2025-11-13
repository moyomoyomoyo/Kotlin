package com.example.myapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                MyApp( modifier = Modifier.padding(innerPadding))
            }
        }
    }
}

@Composable
fun MyApp(modifier: Modifier = Modifier) {
    data class Question( val question: String, val answers: List<Int>, val correctIndex: Int)

    val domanda = Question("Quanto fa 2+2?", listOf(4, 2, 6, 8), correctIndex = 0)
    var displayedText by remember { mutableStateOf(" ") }

    Column(modifier = modifier) {
        Text(text = domanda.question)
        domanda.answers.forEachIndexed { indice, risposta ->
            when (indice) {
                domanda.correctIndex -> Button(onClick = {displayedText = "Risposta corretta!"}) { Text("$risposta") }
                else -> Button(onClick = {displayedText = "Risposta sbagliata!"}) { Text("$risposta") }
            }
        }
        Text(text = displayedText)
    }
}

