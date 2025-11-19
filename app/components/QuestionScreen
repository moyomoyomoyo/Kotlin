package com.example.myapplication.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapp.components.NavigationViewModel
import com.example.myapp.components.Screen

@Composable
fun QuestionScreen(q: Question, nav: NavigationViewModel, modifier: Modifier = Modifier){
    nav.navigateTo(Screen.QUESTION_SCREEN)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF6E7D1)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            q.question,
            Modifier.padding(20.dp),
            fontSize = 32.sp
        )

        q.answers.forEachIndexed { index, answer ->
            val isCorrect = index == q.correctIndex
            Button(
                onClick = {
                    if (isCorrect) nav.updatePoints()
                    nav.nextQuestion()
                },
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors(
                    containerColor = if (isCorrect) Color.Green else Color.Red,
                    contentColor = Color.White
                )
            ) {
                Text(answer.toString(), fontSize = 20.sp)
            }
        }
    }

}
