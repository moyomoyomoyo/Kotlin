package com.example.myapp.components

import android.util.Log.i
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun QuestionsScreen(qvm: QuestionSessionViewModel, modifier: Modifier = Modifier){
    val questionList = QuestionList()
    Column(modifier = Modifier
        .fillMaxSize()
        .statusBarsPadding()
        .background(Color.White)
    ){
        for (i in questionList.quiz.indices){
            when(qvm.nextQuestionIndex()){
                i -> {
                    val q = questionList.quiz[i]
                    i("QuestionsScreen", "Displaying question index: $i")
                    QuestionScreen(q, qvm, modifier)
                }
                questionList.quiz.size -> qvm.navigateTo(Screen.RECAP)
            }

        }


    }
}