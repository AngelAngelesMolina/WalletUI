package com.jaamcoding.walletui.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.toFontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jaamcoding.walletui.R
import com.jaamcoding.walletui.presentation.ui.theme.WalletUITheme


@Composable
fun ActionItem(
    modifier: Modifier = Modifier,
    icon: ImageVector,
    text: String,
    backgroundColor: Color = Color.Red.copy(0.35f)

) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(70.dp)
                .clip(CircleShape)
                .background(backgroundColor),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = icon,
                contentDescription = text,
                tint = Color.Black,
                modifier = Modifier.size(28.dp)
            )
        }
        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = text,
            fontFamily = Font(R.font.play).toFontFamily(),
            fontSize = 16.sp,
            color = MaterialTheme.colorScheme.onBackground

        )
    }


}

@Preview(showBackground = true)
@Composable
private fun ActionItemPrev() {
    WalletUITheme {
        ActionItem(icon = Icons.Filled.Done, text = "Send")
    }
}
