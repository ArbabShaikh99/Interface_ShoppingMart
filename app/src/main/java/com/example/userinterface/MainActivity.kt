package com.example.userinterface

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.userinterface.ui.theme.UserInterfaceTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UserInterfaceTheme {
                val navController = rememberNavController()
                NavGraph(navController = navController)
            }
        }
    }
}