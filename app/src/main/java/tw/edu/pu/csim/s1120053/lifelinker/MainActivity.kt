package tw.edu.pu.csim.s1120053.lifelinker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
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
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
//    1logo頁
        Image(
            painter=painterResource(id=R.drawable.logo),
            contentDescription="logo",
            modifier=Modifier
        )
//    2選項頁
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
//                    )
//                }
//            }
//        }
//    }
//    3基本資料

}