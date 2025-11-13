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


@Composable
fun MyApp(modifier: Modifier = Modifier) {
    data class Question( val question: String, val answers: List<Int>, val correctIndex: Int)
    var points by remember { mutableIntStateOf(0) }
    var fase by remember { mutableStateOf("start") }
    var next by remember { mutableIntStateOf(0) }

    val quiz = listOf(
        Question("Quanto fa 2+2?", listOf(4,2,8,6),  0),
        Question("Quanto fa 2*3?", listOf(4,7,6,3), 2),
        Question("Quanto fa 16:4?", listOf(5,4,6,3), 1)
    )

    Column(modifier = modifier){
        when(fase){
            "start" -> Button(onClick = { fase = "quiz" }) {Text("Start quiz")}
            "quiz" -> {
                for (i in quiz.indices){
                    when(next){
                        quiz.size -> fase = "finish"
                        i -> {
                            Text(text = quiz[i].question)
                            quiz[i].answers.forEachIndexed { indice, risposta ->
                                when(indice) {
                                    quiz[i].correctIndex -> Button(onClick = {
                                        points++
                                        next = i + 1
                                    }) { Text("$risposta") }
                                    else -> Button(onClick = {next = i + 1}) { Text("$risposta") }
                                }
                            }
                        }
                    }
                }
            }
            "finish" -> Text("Il tuo punteggio é $points/${quiz.size}")
        }
    }
}

@Preview(showBackground = false)
@Composable
fun MyAppPreview() {
    MyApp()
}
