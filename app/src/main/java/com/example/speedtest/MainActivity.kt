package com.example.speedtest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.speedtest.ui.theme.SpeedTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SpeedTestTheme {
              
            }
        }
    }
}

@Composable
fun SpeedTestScreen() {

}

@Preview(showBackground = true)
@Composable
fun SpeedTestScreenPreview() {
    SpeedTestTheme {
        SpeedTestScreen()
    }
}