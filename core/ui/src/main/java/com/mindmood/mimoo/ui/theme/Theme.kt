package com.mindmood.mimoo.ui.theme

import android.app.Activity
import android.graphics.Color.toArgb
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowInsetsControllerCompat

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40

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

private val ThemeColorScheme = lightColorScheme(
    background = DefaultBgColor,
)

@Composable
fun MimooTheme(
    content: @Composable () -> Unit
) {
    val isLight = DefaultBgColor.luminance() > 0.5f // false이면 진한색, true 밝은 색으로 표시됨

    val view = LocalView.current
    if (!view.isInEditMode) {
        val window = (view.context as Activity).window
        val insetsController = WindowInsetsControllerCompat(window, view)

        SideEffect {
            // 상태바 및 네비게이션바 투명
            window.statusBarColor = Color.Transparent.toArgb()
            window.navigationBarColor = Color.Transparent.toArgb()
//            window.navigationBarColor = DefaultBgColor.toArgb()// TODO 네비게이션 바 컬러 바꾸고 싶다면 여기서

            // 상태바(화면 상단 바)의 텍스트/아이콘 색상을 밝게 할지 여부를 설정
            insetsController.isAppearanceLightStatusBars = isLight
            // 내비게이션 바(화면 하단의 시스템 버튼 영역)의 텍스트/아이콘 색상 밝기를 설정
            insetsController.isAppearanceLightNavigationBars = isLight
        }
    }
    MaterialTheme(
        colorScheme = ThemeColorScheme
    ) {
        // 여기서 전체 Surface를 사용해 배경 통일
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            content()
        }
    }
}

//@Composable
//fun MimooTheme(
//    darkTheme: Boolean = isSystemInDarkTheme(),
//    // Dynamic color is available on Android 12+
//    dynamicColor: Boolean = true,
//    content: @Composable () -> Unit
//) {
//    val colorScheme = when {
//        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
//            val context = LocalContext.current
//            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
//        }
//
//        darkTheme -> DarkColorScheme
//        else -> LightColorScheme
//    }
//
//    MaterialTheme(
//        colorScheme = colorScheme,
//        typography = Typography,
//        content = content
//    )
//}