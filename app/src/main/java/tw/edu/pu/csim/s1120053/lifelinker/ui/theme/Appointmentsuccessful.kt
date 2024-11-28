package tw.edu.pu.csim.s1120053.lifelinker.ui.theme

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import tw.edu.pu.csim.s1120053.lifelinker.Age
import tw.edu.pu.csim.s1120053.lifelinker.Logo
import tw.edu.pu.csim.s1120053.lifelinker.Option
import tw.edu.pu.csim.s1120053.lifelinker.R
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import tw.edu.pu.csim.s1120053.lifelinker.ui.theme.ui.theme.LifeLinkerTheme

//import kotlin.coroutines.jvm.internal.CompletedContinuation.context

class Appointmentsuccessful : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LifeLinkerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    As(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun As(modifier: Modifier) {
    val context = LocalContext.current
    val activity = (context as Activity)
//    var msg by remember { mutableStateOf("預約成功") }
    Image(
        painter = painterResource(id = R.drawable.bg),
        contentDescription = "bg",
        modifier = Modifier.fillMaxSize()
    )
    Column (
        modifier = Modifier.fillMaxSize().padding(bottom = 16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "預約成功",
            style = TextStyle(fontSize = 30.sp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        TextButton(
            onClick = {
                val intent = Intent(context, Option()::class.java)
                context.startActivity(intent)
            }
        ) {
            Text(text = "回到主畫面")
        }
    }
}