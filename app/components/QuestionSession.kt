package com.example.myapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.myapplication.components.QuestionsScreen
import com.example.myapplication.components.Start


@Composable
fun QuestionSession(nav: NavigationViewModel, modifier: Modifier = Modifier){
    val currentScreen = nav.currentScreen

    Column(modifier = Modifier
        .fillMaxSize()
        .statusBarsPadding()
        .background(Color.White)
    ){
        when(currentScreen){
            Screen.QUIZ_SESSION -> Start(nav, modifier)
            Screen.START -> QuestionsScreen(nav, modifier)
            else -> Text("$currentScreen")
        }
    }

}
