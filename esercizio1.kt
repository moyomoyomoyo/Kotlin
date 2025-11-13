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
import androidx.compose.ui.tooling.preview.Preview


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

// Esercizio 1
// Creare un pulsante che al click cambi il testo

@Composable
fun MyApp(modifier: Modifier = Modifier) {
    var displayedText by remember { mutableStateOf("Priviet!") }
    Column(modifier = modifier) {
        Text(text = displayedText)
        Button(onClick = {displayedText = "Hallo!"}) { Text("Click me")}
    }
}

@Preview(showBackground = false)
@Composable
fun MyAppPreview() {
    MyApp()
}
