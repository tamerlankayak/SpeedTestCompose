package com.example.speedtest

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.speedtest.ui.theme.ComposeSpeedTestTheme
import com.example.speedtest.ui.theme.DarkGradient

@Composable
fun SpeedTestScreen() {

    Column(Modifier.fillMaxSize()) {

    }

}

@Composable
private fun SpeedTestScreen(state: UiState, onClick: () -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(DarkGradient)
    ) {

    }
}

@Preview(showBackground = true)
@Composable
fun SpeedTestScreenPreview() {
    ComposeSpeedTestTheme {
        Surface {
            SpeedTestScreen(
                UiState(
                    speed = "120.5",
                    ping = "5 ms",
                    maxSpeed = "150.0 mbps",
                    arcValue = 0.83f
                )
            ) {

            }
        }
    }
}