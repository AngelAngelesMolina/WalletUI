package com.jaamcoding.walletui.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.toFontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jaamcoding.walletui.R
import com.jaamcoding.walletui.domain.models.SpendingItem
import com.jaamcoding.walletui.presentation.ui.theme.WalletUITheme

@Composable
fun SpendingList(modifier: Modifier = Modifier) {
    LazyRow(
        modifier = modifier,
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        itemsIndexed(spendingItems) { index, spendingItem ->
            SpendingItem(spendingItem = spendingItem)
            Spacer(modifier = Modifier.width(16.dp))
        }
    }
}

@Composable
fun SpendingItem(modifier: Modifier = Modifier, spendingItem: SpendingItem) {
    ElevatedCard(
        modifier = modifier.size(150.dp),
        shape = RoundedCornerShape(20.dp)
    ) {
        Column(
            Modifier
                .fillMaxSize()
                .background(Color.White)
                .background(spendingItem.color.copy(0.5f))
                .padding(20.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                imageVector = spendingItem.icon,
                contentDescription = spendingItem.name,
                tint = Color.Black.copy(0.8f),
                modifier = Modifier.size(33.dp)
            )

            Text(
                text = spendingItem.name,
                fontSize = 15.sp,
                color = Color.Black.copy(0.7f)
            )
            Text(
                text = "$" + spendingItem.amount.toString(),
                fontSize = 20.sp,
                color = Color.Black,
                fontFamily = Font(R.font.play).toFontFamily(),
            )


        }

    }
}

@Preview(showBackground = true)
@Composable
private fun SpendingItemPrev() {
    WalletUITheme {
        SpendingItem(spendingItem = spendingItems.first())
    }
}

@Preview(showBackground = true)
@Composable
private fun SpendingListPrev() {
    WalletUITheme() {
        SpendingList(modifier = Modifier.fillMaxWidth())
    }
}