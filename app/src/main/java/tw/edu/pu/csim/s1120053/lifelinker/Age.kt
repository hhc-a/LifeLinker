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
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
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
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun SexDropdown() {
//    val context = LocalContext.current
//    val sexOptions = listOf("男", "女")
//    var expanded by remember { mutableStateOf(false) }
//    var selectedSex by remember { mutableStateOf(sexOptions[0]) }
//
//    ExposedDropdownMenuBox(
//        expanded = expanded,
//        onExpandedChange = { expanded = !expanded },
//        modifier = Modifier.fillMaxWidth()
//    ) {
//        TextField(
//            value = selectedSex,
//            onValueChange = {},
//            readOnly = true,
//            label = { Text("性別") },
//            trailingIcon = {
//                ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded)
//            },
//            colors = ExposedDropdownMenuDefaults.textFieldColors(),
//            modifier = Modifier.fillMaxWidth()
//        )
//
//        ExposedDropdownMenu(
//            expanded = expanded,
//            onDismissRequest = { expanded = false }
//        ) {
//            sexOptions.forEach { option ->
//                DropdownMenuItem(
//                    onClick = {
//                        selectedSex = option
//                        expanded = false
//                    }
//                ) {
//                    Text(text = option)
//                }
//            }
//        }
//    }
//}
@Composable  //4進階資料
fun Age(modifier: Modifier) {
    var sex by remember { mutableStateOf("") }
    var age by remember { mutableStateOf("") }
    var height by remember { mutableStateOf("") }
    var weight by remember { mutableStateOf("") }
    val context = LocalContext.current
    val activity = (context as Activity)
    Column(
        modifier = Modifier.fillMaxSize(), // 填滿整個螢幕
        verticalArrangement = Arrangement.SpaceBetween // 垂直方向分佈
    ) {
        Column(
            modifier = Modifier.padding(horizontal = 16.dp)
        ) {
            Text("")
//            SexDropdown()
            TextField(
                value = sex,
                onValueChange = { newText -> sex = newText },
                modifier = Modifier.fillMaxWidth(),
                label = { Text("使用者性別") },
                placeholder = { Text("請輸入使用者性別") }
            )
            TextField(
                value = age,
                onValueChange = { newText -> age = newText },
                modifier = Modifier.fillMaxWidth(),
                label = { Text("使用者年齡") },
                placeholder = { Text("請輸入使用者年齡") }
            )
            TextField(
                value = height,
                onValueChange = { newText -> height = newText },
                modifier = Modifier.fillMaxWidth(),
                label = { Text("使用者身高") },
                placeholder = { Text("請輸入使用者身高") }
            )
            TextField(
                value = weight,
                onValueChange = { newText -> weight = newText },
                modifier = Modifier.fillMaxWidth(),
                label = { Text("使用者體重") },
                placeholder = { Text("請輸入使用者體重") }
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp, start = 16.dp, end = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Bottom
        ) {
            TextButton(
                onClick = { activity.finish() }
            ) {
                Text(text = "上一頁")
            }
            TextButton(
                onClick = {
                    val intent = Intent(context, Age::class.java)
                    context.startActivity(intent)
                }
            ) {
                Text(text = "送出")
            }
        }
    }
}