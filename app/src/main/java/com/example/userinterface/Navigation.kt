package com.example.userinterface

import DetailScreen
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import androidx.navigation.NavType
import androidx.navigation.navArgument

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "home") {
        composable("home") { HomeUI(navController) }
        composable(
            "detail/{name}/{description}/{imageResId}/{price}",
            arguments = listOf(
                navArgument("name") { type = NavType.StringType },
                navArgument("description") { type = NavType.StringType },
                navArgument("imageResId") { type = NavType.IntType },
                navArgument("price") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            DetailScreen(
                name = backStackEntry.arguments?.getString("name") ?: "",
                description = backStackEntry.arguments?.getString("description") ?: "",
                imageResId = backStackEntry.arguments?.getInt("imageResId") ?: 0,
                price = backStackEntry.arguments?.getString("price") ?: ""
            )
        }
    }
}
