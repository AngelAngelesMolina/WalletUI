package com.jaamcoding.walletui.presentation.utilities

import androidx.compose.ui.graphics.Color
import kotlin.random.Random

fun randomColor(minBrightness: Int = 50): Color
{
    val random = Random.Default
    val red = random.nextInt(minBrightness, 256)
    val green = random.nextInt(minBrightness, 256)
    val blue = random.nextInt(minBrightness, 256)
    return Color(red, green, blue)
}