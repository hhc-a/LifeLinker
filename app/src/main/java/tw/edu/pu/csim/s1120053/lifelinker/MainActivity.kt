package tw.edu.pu.csim.s1120053.lifelinker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import tw.edu.pu.csim.s1120053.lifelinker.ui.theme.LifeLinkerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LifeLinkerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Logo(modifier = Modifier.padding(innerPadding))
                    //Option(modifier = Modifier.padding(innerPadding))
                    //Basic(modifier = Modifier.padding(innerPadding))
                    //Age(modifier = Modifier.padding(innerPadding))
                    }
                }
            }
        }
    }

@Composable  //1logo頁
fun Logo(modifier: Modifier) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "logo",
            modifier = Modifier
        )
}
//@Composable  //2選項頁
//fun Option(modifier: Modifier) {
//    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
//        Column {
//            Row {
//                Column {
//                    Image(
//                        painter = painterResource(id = R.drawable.weelchair),
//                        contentDescription = "輪椅",
//                        modifier = Modifier
//                            .size(150.dp)
//                    )
//                    Text(
//                        text = "輪椅",
//                        fontFamily = FontFamily(Font(R.font.round)),
//                        fontSize = 20.sp,
//                        color = Color.Black,
//                        modifier = modifier
//                            .align(Alignment.CenterHorizontally)
//                            .offset(y = (-10).dp)
//                    )
//                }
//                Column {
//                    Image(
//                        painter = painterResource(id = R.drawable.walkingaid),
//                        contentDescription = "輪椅",
//                        modifier = Modifier
//                            .size(150.dp)
//                    )
//                    Text(
//                        text = "助行器",
//                        fontFamily = FontFamily(Font(R.font.round)),
//                        fontSize = 20.sp,
//                        color = Color.Black,
//                        modifier = modifier
//                            .align(Alignment.CenterHorizontally)
//                            .offset(y = (-10).dp)
//                    )
//                }
//            }
//            Row {
//                Column {
//                    Image(
//                        painter = painterResource(id = R.drawable.crutch),
//                        contentDescription = "輪椅",
//                        modifier = Modifier
//                            .size(150.dp)
//                    )
//                    Text(
//                        text = "拐杖",
//                        fontFamily = FontFamily(Font(R.font.round)),
//                        fontSize = 20.sp,
//                        color = Color.Black,
//                        modifier = modifier
//                            .align(Alignment.CenterHorizontally)
//                            .offset(y = (-10).dp)
//                    )
//                }
//                Column {
//                    Image(
//                        painter = painterResource(id = R.drawable.repair),
//                        contentDescription = "輪椅",
//                        modifier = Modifier
//                            .size(150.dp)
//                    )
//                    Text(
//                        text = "修復/歸還",
//                        fontFamily = FontFamily(Font(R.font.round)),
//                        fontSize = 20.sp,
//                        color = Color.Black,
//                        modifier = modifier
//                            .align(Alignment.CenterHorizontally)
//                            .offset(y = (-15).dp)
//                    )
//                }
//            }
//        }
//    }
//}
//@Composable  //3基本資料
//fun Basic(modifier: Modifier) {
//        var userName by remember { mutableStateOf("") }
//        var userTel by remember { mutableStateOf("") }
//        var userID by remember { mutableStateOf("") }
//        var contactName by remember { mutableStateOf("") }
//        var contactTel by remember { mutableStateOf("") }
//        var contactMail by remember { mutableStateOf("") }
////        var msg by remember { mutableStateOf("訊息") }
////    val db = Firebase.firestore
//        Column{ //(modifier= Modifier
////            .fillMaxSize()
////            .background(Color.White),
////            verticalArrangement = Arrangement.Center,
////            horizontalAlignment = Alignment.CenterHorizontally
////        )
//            TextField(
//                value = userName,
//                onValueChange = { newText ->
//                    userName = newText
//                },
//                modifier = modifier,
//                label = { Text("使用者姓名") },
//                placeholder = { Text("請輸入使用者姓名") }
//            )
//            TextField(
//                value = userTel,
//                onValueChange = { newText ->
//                    userTel = newText
//                },
//                label = { Text("使用者電話") },
//                placeholder = { Text("請輸入使用者電話") }
////                keyboardOptions = KeyboardOptions
////                    (keyboardType = KeyboardType.Number)
//            )
//            TextField(
//                value = userID,
//                onValueChange = { newText ->
//                    userID = newText
//                },
//                label = { Text("使用者身分證或護照號") },
//                placeholder = { Text(text = "請輸入使用者身分證或護照號") },
////                visualTransformation = PasswordVisualTransformation(),
////                keyboardOptions = KeyboardOptions
////                    (keyboardType = KeyboardType.Password)
//            )
////            身障證明
////            經濟別
//            TextField(
//                value = contactName,
//                onValueChange = { newText ->
//                    contactName = newText
//                },
//                label = { Text("租借人(聯絡人)姓名") },
//                placeholder = { Text("請輸入您的姓名") }
//            )
//            TextField(
//                value = contactTel,
//                onValueChange = { newText ->
//                    contactTel = newText
//                },
//                label = { Text("租借人(聯絡人)電話") },
//                placeholder = { Text("請輸入您的電話") }
//            )
//            TextField(
//                value = contactMail,
//                onValueChange = { newText ->
//                    contactMail = newText
//                },
//                label = { Text("租借人(聯絡人)信箱") },
//                placeholder = { Text("請輸入您的信箱") }
//            )
//    }
//}
//@Composable  //4進階資料
//fun Age(modifier: Modifier) {
//    var sex by remember { mutableStateOf("") }
//    var age by remember { mutableStateOf("") }
//    var height by remember { mutableStateOf("") }
//    var weight by remember { mutableStateOf("") }
//    Column{
//        TextField(
//                value = sex,
//                onValueChange = { newText ->
//                    sex = newText
//                },
//                modifier = modifier,
//                label = { Text("使用者性別") },
//                placeholder = { Text("請輸入使用者性別") }
//            )
//        TextField(
//            value = age,
//            onValueChange = { newText ->
//                age = newText
//            },
//            label = { Text("使用者年齡") },
//            placeholder = { Text("請輸入使用者年齡") }
//        )
//        TextField(
//            value = height,
//            onValueChange = { newText ->
//                height = newText
//            },
//            label = { Text("使用者身高") },
//            placeholder = { Text("請輸入使用者身高") }
//        )
//        TextField(
//            value = weight,
//            onValueChange = { newText ->
//                weight = newText
//            },
//            label = { Text("使用者體重") },
//            placeholder = { Text("請輸入使用者體重") }
//        )
//    }
//}

