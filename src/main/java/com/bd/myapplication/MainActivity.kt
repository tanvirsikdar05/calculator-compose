package com.bd.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bd.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(modifier=modifier.fillMaxSize()) {
        Box(contentAlignment = Alignment.CenterEnd,modifier= modifier
            .fillMaxWidth()
            .background(Color.LightGray)
            .weight(2f)) {
            Text(text = "0", fontSize = 100.sp,modifier=modifier.padding(end = 10.dp))


        }
        Row (modifier= modifier
            .fillMaxWidth()
            .background(Color.White)
            .weight(5f)
            ){
            Column(modifier = modifier
                .fillMaxSize()
                .weight(3f)) {
                Row(modifier= modifier
                    .fillMaxSize()
                    .weight(1f)) {
                    Box(contentAlignment = Alignment.Center,modifier = modifier
                        .padding(5.dp)
                        .fillMaxHeight()
                        .background(Color.DarkGray)
                        .weight(1f)){
                        Text(text = "C", fontSize = 20.sp, color = Color.White)
                    }
                    Box(contentAlignment = Alignment.Center,modifier = modifier
                        .padding(5.dp)
                        .fillMaxHeight()
                        .background(Color.DarkGray)
                        .weight(1f)){
                        Text(text = "/", fontSize = 20.sp, color = Color.White)
                    }
                    Box(contentAlignment = Alignment.Center,modifier = modifier
                        .padding(5.dp)
                        .fillMaxHeight()
                        .background(Color.DarkGray)
                        .weight(1f)){
                        Text(text = "*", fontSize = 20.sp, color = Color.White)
                    }

                }
                Row(modifier= modifier
                    .fillMaxSize()
                    .weight(1f)) {
                    Box(contentAlignment = Alignment.Center,modifier = modifier
                        .padding(5.dp)
                        .fillMaxHeight()
                        .background(Color.DarkGray)
                        .weight(1f)){
                        Text(text = "1", fontSize = 20.sp, color = Color.White)
                    }
                    Box(contentAlignment = Alignment.Center,modifier = modifier
                        .padding(5.dp)
                        .fillMaxHeight()
                        .background(Color.DarkGray)
                        .weight(1f)){
                        Text(text = "2", fontSize = 20.sp, color = Color.White)
                    }
                    Box(contentAlignment = Alignment.Center,modifier = modifier
                        .padding(5.dp)
                        .fillMaxHeight()
                        .background(Color.DarkGray)
                        .weight(1f)){
                        Text(text = "3", fontSize = 20.sp, color = Color.White)
                    }

                }
                Row(modifier= modifier
                    .fillMaxSize()
                    .weight(1f)) {
                    Box(contentAlignment = Alignment.Center,modifier = modifier
                        .padding(5.dp)
                        .fillMaxHeight()
                        .background(Color.DarkGray)
                        .weight(1f)){
                        Text(text = "4", fontSize = 20.sp, color = Color.White)
                    }
                    Box(contentAlignment = Alignment.Center,modifier = modifier
                        .padding(5.dp)
                        .fillMaxHeight()
                        .background(Color.DarkGray)
                        .weight(1f)){
                        Text(text = "5", fontSize = 20.sp, color = Color.White)
                    }
                    Box(contentAlignment = Alignment.Center,modifier = modifier
                        .padding(5.dp)
                        .fillMaxHeight()
                        .background(Color.DarkGray)
                        .weight(1f)){
                        Text(text = "6", fontSize = 20.sp, color = Color.White)
                    }

                }
                Row(modifier= modifier
                    .fillMaxSize()
                    .weight(1f)) {
                    Box(contentAlignment = Alignment.Center,modifier = modifier
                        .padding(5.dp)
                        .fillMaxHeight()
                        .background(Color.DarkGray)
                        .weight(1f)){
                        Text(text = "7", fontSize = 20.sp, color = Color.White)
                    }
                    Box(contentAlignment = Alignment.Center,modifier = modifier
                        .padding(5.dp)
                        .fillMaxHeight()
                        .background(Color.DarkGray)
                        .weight(1f)){
                        Text(text = "8", fontSize = 20.sp, color = Color.White)
                    }
                    Box(contentAlignment = Alignment.Center,modifier = modifier
                        .padding(5.dp)
                        .fillMaxHeight()
                        .background(Color.DarkGray)
                        .weight(1f)){
                        Text(text = "9", fontSize = 20.sp, color = Color.White)
                    }

                }
                Row(modifier= modifier
                    .fillMaxSize()
                    .weight(1f)) {
                    Box(contentAlignment = Alignment.Center,modifier = modifier
                        .padding(5.dp)
                        .fillMaxHeight()
                        .background(Color.DarkGray)
                        .weight(2f)){
                        Text(text = "0", fontSize = 20.sp, color = Color.White)
                    }
                    Box(contentAlignment = Alignment.Center,modifier = modifier
                        .padding(5.dp)
                        .fillMaxHeight()
                        .background(Color.DarkGray)
                        .weight(1f)){
                        Text(text = ".", fontSize = 20.sp, color = Color.White)
                    }


                }



            }
            Column(modifier = modifier
                .fillMaxHeight()
                .weight(1f)) {
                Column {
                    Box(contentAlignment = Alignment.Center,modifier = modifier
                        .padding(5.dp)
                        .fillMaxWidth()
                        .background(Color.DarkGray)
                        .weight(1f)){
                        Text(text = "-", fontSize = 20.sp, color = Color.White)
                    }
                    Box(contentAlignment = Alignment.Center,modifier = modifier
                        .padding(5.dp)
                        .fillMaxWidth()
                        .background(Color.DarkGray)
                        .weight(1f)){
                        Text(text = "+", fontSize = 20.sp, color = Color.White)
                    }
                    Box(contentAlignment = Alignment.Center,modifier = modifier
                        .padding(5.dp)
                        .fillMaxWidth()
                        .background(Color.DarkGray)
                        .weight(1f)){
                        Text(text = "=", fontSize = 20.sp, color = Color.White)
                    }

                }

            }





        }

    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}