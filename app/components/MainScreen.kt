package com.example.myapp.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.myapplication.components.QuestionsScreen
import components.NavBar

@Composable
fun MainScreen(nav: NavigationViewModel, modifier: Modifier = Modifier) {

    NavBar(nav, modifier)

    when(nav.currentScreen) {
        Screen.QUIZ_SESSION -> QuestionSession(nav, modifier)
        Screen.START-> QuestionsScreen(nav, modifier)
        Screen.ABOUT -> About()
        else -> Screen.HOME
    }



}
