package com.mindmood.mimoo.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.mindmood.mimoo.ui.R

val DefaultFontFamily = FontFamily(Font(R.font.nanum_baeg_euieuiceonsa))

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)

@Immutable
private class DefaultTextStyle(
    fontFamily: FontFamily,
    fontSize: TextUnit,
    lineHeight: TextUnit,
    fontWeight: FontWeight = FontWeight.Normal,
) {
    val style: TextStyle = TextStyle(
        fontFamily = fontFamily,
        fontSize = fontSize,
        lineHeight = lineHeight,
        fontWeight = fontWeight,
        lineHeightStyle = LineHeightStyle(
            alignment = LineHeightStyle.Alignment.Center,
            trim = LineHeightStyle.Trim.None
        )
    )
}

@Immutable
object CustomTypography {
    // Large Text Styles (24sp)
    val Large_Thin = DefaultTextStyle(
        fontFamily = DefaultFontFamily,
        fontSize = 24.sp,
        lineHeight = 1.2.em,
        fontWeight = FontWeight.Thin
    ).style
    
    val Large_Light = DefaultTextStyle(
        fontFamily = DefaultFontFamily,
        fontSize = 24.sp,
        lineHeight = 1.2.em,
        fontWeight = FontWeight.Light
    ).style
    
    val Large_Normal = DefaultTextStyle(
        fontFamily = DefaultFontFamily,
        fontSize = 24.sp,
        lineHeight = 1.2.em,
        fontWeight = FontWeight.Normal
    ).style
    
    val Large_Medium = DefaultTextStyle(
        fontFamily = DefaultFontFamily,
        fontSize = 24.sp,
        lineHeight = 1.2.em,
        fontWeight = FontWeight.Medium
    ).style
    
    val Large_SemiBold = DefaultTextStyle(
        fontFamily = DefaultFontFamily,
        fontSize = 24.sp,
        lineHeight = 1.2.em,
        fontWeight = FontWeight.SemiBold
    ).style
    
    val Large_Bold = DefaultTextStyle(
        fontFamily = DefaultFontFamily,
        fontSize = 24.sp,
        lineHeight = 1.2.em,
        fontWeight = FontWeight.Bold
    ).style
    
    // Medium Text Styles (18sp)
    val Medium_Thin = DefaultTextStyle(
        fontFamily = DefaultFontFamily,
        fontSize = 18.sp,
        lineHeight = 1.2.em,
        fontWeight = FontWeight.Thin
    ).style
    
    val Medium_Light = DefaultTextStyle(
        fontFamily = DefaultFontFamily,
        fontSize = 18.sp,
        lineHeight = 1.2.em,
        fontWeight = FontWeight.Light
    ).style
    
    val Medium_Normal = DefaultTextStyle(
        fontFamily = DefaultFontFamily,
        fontSize = 18.sp,
        lineHeight = 1.2.em,
        fontWeight = FontWeight.Normal
    ).style
    
    val Medium_Medium = DefaultTextStyle(
        fontFamily = DefaultFontFamily,
        fontSize = 18.sp,
        lineHeight = 1.2.em,
        fontWeight = FontWeight.Medium
    ).style
    
    val Medium_SemiBold = DefaultTextStyle(
        fontFamily = DefaultFontFamily,
        fontSize = 18.sp,
        lineHeight = 1.2.em,
        fontWeight = FontWeight.SemiBold
    ).style
    
    val Medium_Bold = DefaultTextStyle(
        fontFamily = DefaultFontFamily,
        fontSize = 18.sp,
        lineHeight = 1.2.em,
        fontWeight = FontWeight.Bold
    ).style
    
    // Default Text Styles (16sp)
    val Default_Thin = DefaultTextStyle(
        fontFamily = DefaultFontFamily,
        fontSize = 16.sp,
        lineHeight = 1.2.em,
        fontWeight = FontWeight.Thin
    ).style
    
    val Default_Light = DefaultTextStyle(
        fontFamily = DefaultFontFamily,
        fontSize = 16.sp,
        lineHeight = 1.2.em,
        fontWeight = FontWeight.Light
    ).style
    
    val Default_Normal = DefaultTextStyle(
        fontFamily = DefaultFontFamily,
        fontSize = 16.sp,
        lineHeight = 1.2.em,
        fontWeight = FontWeight.Normal
    ).style
    
    val Default_Medium = DefaultTextStyle(
        fontFamily = DefaultFontFamily,
        fontSize = 16.sp,
        lineHeight = 1.2.em,
        fontWeight = FontWeight.Medium
    ).style
    
    val Default_SemiBold = DefaultTextStyle(
        fontFamily = DefaultFontFamily,
        fontSize = 16.sp,
        lineHeight = 1.2.em,
        fontWeight = FontWeight.SemiBold
    ).style
    
    val Default_Bold = DefaultTextStyle(
        fontFamily = DefaultFontFamily,
        fontSize = 16.sp,
        lineHeight = 1.2.em,
        fontWeight = FontWeight.Bold
    ).style
    
    // Small Text Styles (14sp)
    val Small_Thin = DefaultTextStyle(
        fontFamily = DefaultFontFamily,
        fontSize = 14.sp,
        lineHeight = 1.2.em,
        fontWeight = FontWeight.Thin
    ).style
    
    val Small_Light = DefaultTextStyle(
        fontFamily = DefaultFontFamily,
        fontSize = 14.sp,
        lineHeight = 1.2.em,
        fontWeight = FontWeight.Light
    ).style
    
    val Small_Normal = DefaultTextStyle(
        fontFamily = DefaultFontFamily,
        fontSize = 14.sp,
        lineHeight = 1.2.em,
        fontWeight = FontWeight.Normal
    ).style
    
    val Small_Medium = DefaultTextStyle(
        fontFamily = DefaultFontFamily,
        fontSize = 14.sp,
        lineHeight = 1.2.em,
        fontWeight = FontWeight.Medium
    ).style
    
    val Small_SemiBold = DefaultTextStyle(
        fontFamily = DefaultFontFamily,
        fontSize = 14.sp,
        lineHeight = 1.2.em,
        fontWeight = FontWeight.SemiBold
    ).style
    
    val Small_Bold = DefaultTextStyle(
        fontFamily = DefaultFontFamily,
        fontSize = 14.sp,
        lineHeight = 1.2.em,
        fontWeight = FontWeight.Bold
    ).style
    
    // Extra Small Text Styles (12sp)
    val ExtraSmall_Thin = DefaultTextStyle(
        fontFamily = DefaultFontFamily,
        fontSize = 12.sp,
        lineHeight = 1.2.em,
        fontWeight = FontWeight.Thin
    ).style
    
    val ExtraSmall_Light = DefaultTextStyle(
        fontFamily = DefaultFontFamily,
        fontSize = 12.sp,
        lineHeight = 1.2.em,
        fontWeight = FontWeight.Light
    ).style
    
    val ExtraSmall_Normal = DefaultTextStyle(
        fontFamily = DefaultFontFamily,
        fontSize = 12.sp,
        lineHeight = 1.2.em,
        fontWeight = FontWeight.Normal
    ).style
    
    val ExtraSmall_Medium = DefaultTextStyle(
        fontFamily = DefaultFontFamily,
        fontSize = 12.sp,
        lineHeight = 1.2.em,
        fontWeight = FontWeight.Medium
    ).style
    
    val ExtraSmall_SemiBold = DefaultTextStyle(
        fontFamily = DefaultFontFamily,
        fontSize = 12.sp,
        lineHeight = 1.2.em,
        fontWeight = FontWeight.SemiBold
    ).style
    
    val ExtraSmall_Bold = DefaultTextStyle(
        fontFamily = DefaultFontFamily,
        fontSize = 12.sp,
        lineHeight = 1.2.em,
        fontWeight = FontWeight.Bold
    ).style
}