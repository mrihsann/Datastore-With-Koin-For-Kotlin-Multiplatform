package com.ihsanarslan.datastorekoforkotlinmultiplatform

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import com.ihsanarslan.datastorekoforkotlinmultiplatform.ui.home.HomeScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App(prefs : DataStore<Preferences>) {
    MaterialTheme {
        HomeScreen()
    }
}