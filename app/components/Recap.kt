import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
import com.example.myapp.components.NavigationViewModel
import com.example.myapp.components.Screen
import com.example.myapp.ui.theme.Gummy

@Composable
fun Recap(nav: NavigationViewModel, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF6E7D1)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            "Il tuo punteggio è ${nav.returnPoints()}/${nav.totalQuestions}",
            fontFamily = Gummy,
            fontSize = 30.sp
        )
    }

    Row (modifier = Modifier
        .fillMaxSize()
        .statusBarsPadding(),
        verticalAlignment = Alignment.Bottom
    ) {
        Button(
            onClick = {nav.navigateTo(Screen.HOME)},
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
                "Home",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
            )
        }
    }
}
