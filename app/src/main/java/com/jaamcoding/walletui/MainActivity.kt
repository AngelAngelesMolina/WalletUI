package com.jaamcoding.walletui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import com.jaamcoding.walletui.presentation.components.TopBar
import com.jaamcoding.walletui.presentation.screens.MainScreen
import com.jaamcoding.walletui.presentation.ui.theme.WalletUITheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WalletUITheme {
                val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
                Scaffold(
                    modifier = Modifier
                        .fillMaxSize()
                        .nestedScroll(scrollBehavior.nestedScrollConnection),
                    topBar = {
                        TopBar(modifier = Modifier.fillMaxWidth(), scrollBehavior = scrollBehavior)
                    },

                    ) { innerPadding ->
                   MainScreen(modifier = Modifier
                       .fillMaxSize()
                       .padding(innerPadding))
                }
            }
        }
    }
}

