package com.example.myapplication.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.myapp.components.NavigationViewModel

@Composable
fun QuestionsScreen(nav: NavigationViewModel, modifier: Modifier = Modifier){
    val questionList = QuestionList()
    Column(modifier = Modifier
        .fillMaxSize()
        .statusBarsPadding()
        .background(Color.White)
    ){
        for (q in questionList.quiz){
            QuestionScreen(q, nav, modifier)
        }
    }
}
