package com.selimcinar.statemanagmentcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.selimcinar.statemanagmentcompose.ui.theme.StateManagmentComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            }
        }
    }


@Composable
fun MainScreen(){
    //State Hoisting
    var myString = remember {
        mutableStateOf("")
    }
    Surface (modifier = Modifier.fillMaxSize()) {


        Column (verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            SpecialText(string = "Test")
            Spacer(modifier = Modifier.padding(5.dp))
            SpecialText(string = "Android")
            SpecialTextField(myString.value){
                myString.value=it
            }
        }
    }
}
@Composable
fun SpecialText(string: String){
    Text(text = string,
        fontSize = 20.sp,
        fontStyle = FontStyle.Italic,
        fontFamily = FontFamily.Serif
        )
}

@Composable
fun SpecialTextField(string: String,function:(String)->Unit){
 //   var myString = remember {
   //     mutableStateOf("")}

        TextField(value = string, onValueChange = function,
            modifier = Modifier.padding(5.dp))
    }


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

}