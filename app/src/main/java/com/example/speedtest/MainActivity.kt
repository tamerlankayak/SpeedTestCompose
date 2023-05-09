package com.example.speedtest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.example.speedtest.ui.theme.ComposeSpeedTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeSpeedTestTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize(),
                ) {
                    //init screen of speed
                    SpeedTestScreen()
                }
            }
        }
    }
}

