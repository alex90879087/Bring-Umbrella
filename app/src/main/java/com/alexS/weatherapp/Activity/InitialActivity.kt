package com.alexS.weatherapp.Activity

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
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
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class InitialActivity : ComponentActivity() {

    @Inject
    lateinit var pref: SharedPreferences


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        // temp implementation, will have login modeul later on with
        // encrypted shareprefnces
        pref.edit().putBoolean("LogInStatus", true).apply();

        var isLoggedIn = pref.getBoolean("LogInStatus", false);

        Log.d("testtest", "onCreate: in initial  ")

        // having logic because I want to have saveInstance in the future
        // or it will be redirect to login page this serve just as an
        // middle ware
        val nextActivity = if (isLoggedIn) {
            MainActivity::class.java
        } else {
            LoginActivity::class.java
        }

        startActivity(Intent(applicationContext, nextActivity))

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
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WeatheTheme {
        Text("Android")
    }
}