package com.example.myapp.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NavBar(nav: NavigationViewModel, modifier: Modifier = Modifier) {
    Row (modifier = Modifier
        .fillMaxSize()
        .statusBarsPadding(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.Bottom
    ) {
        Button(
            onClick = {},
            modifier = modifier
                .fillMaxWidth()
                .height(100.dp)
                .weight(1f),
            shape = RectangleShape,
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF778592),
                contentColor = Color.White
            )
        ) {
            Text(
                "About",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
            )
        }

        Button(
            onClick = {nav.navigateTo(Screen.QUIZ_SESSION)},
            modifier = modifier
                .height(100.dp)
                .weight(1f),
            shape = RectangleShape,
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF89b5f0),
                contentColor = Color.White
            )

        ) {
            Text(
                "Quiz",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}