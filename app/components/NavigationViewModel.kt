package com.example.myapp.components

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class NavigationViewModel : ViewModel() {
    var currentScreen by mutableStateOf(Screen.HOME)
        private set
    var points = mutableStateOf(0)
    var next = mutableStateOf(0)

    fun navigateTo(screen: Screen) {
        currentScreen = screen
    }

    fun updatePoints(){
        points.value++
    }

    fun nextQuestion(){
        next.value++
    }

}
