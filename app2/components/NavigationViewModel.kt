package com.example.myapp.components

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel

class NavigationViewModel : ViewModel() {
    var currentScreen by mutableStateOf(Screen.HOME)
        private set

    fun navigateTo(screen: Screen) {
        currentScreen = screen
    }

}