package com.example.myapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


@Composable
fun QuestionSession(qvm: QuestionSessionViewModel, modifier: Modifier = Modifier){
    val currentSession = qvm.currentSession

    Column(modifier = Modifier
        .fillMaxSize()
        .statusBarsPadding()
        .background(Color.White)
    ){
        when(currentSession){
            Screen.START -> Start(qvm, modifier)
            Screen.QUIZ_SCREEN -> QuestionsScreen(qvm, modifier)
            else -> Text("${qvm.currentSession}")
        }
    }

}