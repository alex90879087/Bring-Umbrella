package com.alexS.weatherapp.Activity

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.alexS.weatherapp.ui.theme.WeatheTheme

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        Log.d("testtest", "onCreate: in Main  ")

        setContent {
            WeatheTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Magenta
                ) {
                    Row(                    modifier = Modifier.fillMaxSize(),
                    ) {

                        Text("HELOEOEOPAOSIDPASODI")
                    }
                }
            }
        }
    }

}


@Composable
fun MainActivity(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
