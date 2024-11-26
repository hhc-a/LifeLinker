package tw.edu.pu.csim.s1120053.lifelinker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import tw.edu.pu.csim.s1120053.lifelinker.ui.theme.LifeLinkerTheme

class Age : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LifeLinkerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Age(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
@Composable  //4進階資料
fun Age(modifier: Modifier) {
    var sex by remember { mutableStateOf("") }
    var age by remember { mutableStateOf("") }
    var height by remember { mutableStateOf("") }
    var weight by remember { mutableStateOf("") }
    Column{
        TextField(
                value = sex,
                onValueChange = { newText ->
                    sex = newText
                },
                modifier = modifier,
                label = { Text("使用者性別") },
                placeholder = { Text("請輸入使用者性別") }
            )
        TextField(
            value = age,
            onValueChange = { newText ->
                age = newText
            },
            label = { Text("使用者年齡") },
            placeholder = { Text("請輸入使用者年齡") }
        )
        TextField(
            value = height,
            onValueChange = { newText ->
                height = newText
            },
            label = { Text("使用者身高") },
            placeholder = { Text("請輸入使用者身高") }
        )
        TextField(
            value = weight,
            onValueChange = { newText ->
                weight = newText
            },
            label = { Text("使用者體重") },
            placeholder = { Text("請輸入使用者體重") }
        )
    }
}