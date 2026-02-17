package com.jaamcoding.walletui.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.GridView
import androidx.compose.material.icons.rounded.ArrowDownward
import androidx.compose.material.icons.rounded.ArrowUpward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.jaamcoding.walletui.presentation.ui.theme.WalletUITheme

@Composable
fun ActionsSection(
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        ActionItem(
            icon = Icons.Rounded.ArrowUpward,
            text = "Send",
            backgroundColor = Color.Red.copy(0.35f)
        )
        ActionItem(
            icon = Icons.Rounded.ArrowDownward,
            text = "Receive",
            backgroundColor = Color.Green.copy(0.35f)
        )

        ActionItem(
            icon = Icons.Outlined.GridView,
            text = "More",
            backgroundColor = Color.Gray.copy(0.35f)
        )

    }
}

@Preview(showBackground = true)
@Composable
private fun ActionsSectionPrev() {
    WalletUITheme {
        ActionsSection()
    }
}