package com.example.myapp.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun MainScreen(nav: NavigationViewModel, modifier: Modifier = Modifier){
    val qvm: QuestionSessionViewModel = viewModel()
    val currentScreen = nav.currentScreen

    when(currentScreen){
        Screen.QUIZ_SESSION -> QuestionSession(qvm, modifier)
        Screen.ABOUT -> About()
        else -> Text("$currentScreen")
    }




}