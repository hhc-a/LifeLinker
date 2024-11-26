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

class BasicInfo : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LifeLinkerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Basic(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable  //3基本資料
fun Basic(modifier: Modifier) {
        var userName by remember { mutableStateOf("") }
        var userTel by remember { mutableStateOf("") }
        var userID by remember { mutableStateOf("") }
        var contactName by remember { mutableStateOf("") }
        var contactTel by remember { mutableStateOf("") }
        var contactMail by remember { mutableStateOf("") }
//        var msg by remember { mutableStateOf("訊息") }
//    val db = Firebase.firestore
        Column{
            TextField(
                value = userName,
                onValueChange = { newText ->
                    userName = newText
                },
                modifier = modifier,
                label = { Text("使用者姓名") },
                placeholder = { Text("請輸入使用者姓名") }
            )
            TextField(
                value = userTel,
                onValueChange = { newText ->
                    userTel = newText
                },
                label = { Text("使用者電話") },
                placeholder = { Text("請輸入使用者電話") }
//                keyboardOptions = KeyboardOptions
//                    (keyboardType = KeyboardType.Number)
            )
            TextField(
                value = userID,
                onValueChange = { newText ->
                    userID = newText
                },
                label = { Text("使用者身分證或護照號") },
                placeholder = { Text(text = "請輸入使用者身分證或護照號") },
//                visualTransformation = PasswordVisualTransformation(),
//                keyboardOptions = KeyboardOptions
//                    (keyboardType = KeyboardType.Password)
            )
//            身障證明
//            經濟別
            TextField(
                value = contactName,
                onValueChange = { newText ->
                    contactName = newText
                },
                label = { Text("租借人(聯絡人)姓名") },
                placeholder = { Text("請輸入您的姓名") }
            )
            TextField(
                value = contactTel,
                onValueChange = { newText ->
                    contactTel = newText
                },
                label = { Text("租借人(聯絡人)電話") },
                placeholder = { Text("請輸入您的電話") }
            )
            TextField(
                value = contactMail,
                onValueChange = { newText ->
                    contactMail = newText
                },
                label = { Text("租借人(聯絡人)信箱") },
                placeholder = { Text("請輸入您的信箱") }
            )
    }
}