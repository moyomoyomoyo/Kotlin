package com.example.myapplication.components

import android.util.Log.i
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.myapp.components.NavigationViewModel
import com.example.myapp.components.Screen

@Composable
fun QuestionsScreen(nav: NavigationViewModel, modifier: Modifier = Modifier){
    val questionList = QuestionList()
    Column(modifier = Modifier
        .fillMaxSize()
        .statusBarsPadding()
        .background(Color.White)
    ){
        for (i in questionList.quiz.indices){
            when(nav.nextQuestionIndex()){
                i -> {
                    val q = questionList.quiz[i]
                    i("QuestionsScreen", "Displaying question index: $i")
                    QuestionScreen(q, nav, modifier)
                }
                questionList.quiz.size -> nav.navigateTo(Screen.RECAP)
            }

        }


    }
}
