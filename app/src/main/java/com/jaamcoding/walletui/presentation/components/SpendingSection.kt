package com.jaamcoding.walletui.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.graphics.Color
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.DirectionsRun
import androidx.compose.material.icons.rounded.Restaurant
import androidx.compose.material.icons.rounded.ShoppingBag
import androidx.compose.material.icons.rounded.Subscriptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.toFontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jaamcoding.walletui.R
import com.jaamcoding.walletui.domain.models.SpendingItem
import com.jaamcoding.walletui.presentation.ui.theme.WalletUITheme
import com.jaamcoding.walletui.presentation.utilities.randomColor

val spendingItems = listOf(
    SpendingItem(
        name = "Food",
        amount = 123f,
        color = randomColor(),
        icon = Icons.Rounded.Restaurant
    ),
    SpendingItem(
        name = "Shopping",
        amount = 166f,
        color = randomColor(),
        icon = Icons.Rounded.ShoppingBag
    ),
    SpendingItem(
        name = "Subscriptions",
        amount = 84f,
        color = randomColor(),
        icon = Icons.Rounded.Subscriptions
    ),
    SpendingItem(
        name = "Health",
        amount = 140f,
        color = randomColor(),
        icon = Icons.AutoMirrored.Rounded.DirectionsRun
    )

)

@Composable
fun SpendingSection(modifier: Modifier = Modifier) {
    Column(
        modifier,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            modifier = Modifier.padding(horizontal = 22.dp),
            text = "Spending Breakdown",
            fontFamily = Font(R.font.play).toFontFamily(),
            fontSize = 25.sp,
        )
        Spacer(modifier = Modifier.height(16.dp))
        SpendingList()
    }

}


@Preview(showBackground = true)
@Composable
private fun SpendingSectionPrev() {
    WalletUITheme {
        SpendingSection()
    }
}