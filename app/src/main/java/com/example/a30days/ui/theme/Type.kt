package com.example.a30days.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a30days.R

// Set of Material typography styles to start with
val Sigmar = FontFamily(
    Font(R.font.sigmar_regular)
)
val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = Sigmar,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp,

    ),
    displayMedium = TextStyle(
        fontFamily = Sigmar,
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp
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