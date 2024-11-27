package tw.edu.pu.csim.s1120053.lifelinker

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
        val context = LocalContext.current
        val activity = (context as Activity)
//        var msg by remember { mutableStateOf("訊息") }
//    val db = Firebase.firestore
    Column(
        modifier = Modifier.fillMaxSize(), // 填滿整個螢幕
        verticalArrangement = Arrangement.SpaceBetween // 垂直方向分佈
    ) {
        Column(
            modifier = Modifier.padding(horizontal = 16.dp)
        ) {
            Text("")
            TextField(
                value = userName,
                onValueChange = { newText ->
                    userName = newText
                },
                modifier = Modifier.fillMaxWidth(),
                label = { Text("使用者姓名") },
                placeholder = { Text("請輸入使用者姓名") }
            )
            TextField(
                value = userTel,
                onValueChange = { newText ->
                    userTel = newText
                },
                modifier = Modifier.fillMaxWidth(),
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
                modifier = Modifier.fillMaxWidth(),
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
                modifier = Modifier.fillMaxWidth(),
                label = { Text("租借人(聯絡人)姓名") },
                placeholder = { Text("請輸入您的姓名") }
            )
            TextField(
                value = contactTel,
                onValueChange = { newText ->
                    contactTel = newText
                },
                modifier = Modifier.fillMaxWidth(),
                label = { Text("租借人(聯絡人)電話") },
                placeholder = { Text("請輸入您的電話") }
            )
            TextField(
                value = contactMail,
                onValueChange = { newText ->
                    contactMail = newText
                },
                modifier = Modifier.fillMaxWidth(),
                label = { Text("租借人(聯絡人)信箱") },
                placeholder = { Text("請輸入您的信箱") }
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Bottom
        ) {
            TextButton(
                onClick = {
                    activity.finish()
                }
            ) {
                Text(text = "回到主畫面")
            }
            TextButton(
                onClick = {
                    val intent = Intent(context, Age::class.java)
                    context.startActivity(intent)
                }
            ) {
                Text(text = "下一頁")
            }
        }
    }
}