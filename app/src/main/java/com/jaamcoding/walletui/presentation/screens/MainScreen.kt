package com.jaamcoding.walletui.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jaamcoding.walletui.presentation.components.ActionsSection
import com.jaamcoding.walletui.presentation.components.CardSection
import com.jaamcoding.walletui.presentation.ui.theme.WalletUITheme

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .verticalScroll(
                rememberScrollState()
            )
    ) {
        Spacer(Modifier.height(30.dp))
        CardSection(modifier = Modifier.fillMaxWidth())
        Spacer(Modifier.height(20.dp))
        ActionsSection(modifier = Modifier.fillMaxWidth())

    }
}


@Preview(showBackground = true)
@Composable
private fun MainScreenPrev() {
    WalletUITheme {
        MainScreen()
    }
}
