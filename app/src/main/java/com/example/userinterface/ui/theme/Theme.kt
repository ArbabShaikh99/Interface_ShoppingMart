package com.example.userinterface.ui.theme


import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = DarkBlack,
    secondary = DarkBlack,
    tertiary = DarkBlack
)

private val LightColorScheme = lightColorScheme(
    primary = DarkBlack,
    secondary = DarkBlack,
    tertiary = LiteBlack

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun UserInterfaceTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
//    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colors = if(darkTheme){
        DarkColorScheme
    }else{
        lightColorScheme()
    }

    MaterialTheme(
        colorScheme = colors,
        typography = Typography(),
        content = content
    )
}