package com.ihsanarslan.datastorekoforkotlinmultiplatform

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.ihsanarslan.datastorekoforkotlinmultiplatform.ui.home.HomeScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        HomeScreen()
    }
}