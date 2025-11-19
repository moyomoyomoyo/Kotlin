package com.example.myapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.myapp.components.MainScreen
import com.example.myapp.components.NavigationViewModel


class MainActivity : ComponentActivity() {
    private val nav: NavigationViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                Greeting(nav, modifier = Modifier.padding(innerPadding))
            }

        }
    }
}

@Composable
fun Greeting(nav: NavigationViewModel, modifier: Modifier = Modifier) {
    Text(
        text = "Hello",
        modifier = modifier
    )
    MainScreen(nav, modifier)
}
