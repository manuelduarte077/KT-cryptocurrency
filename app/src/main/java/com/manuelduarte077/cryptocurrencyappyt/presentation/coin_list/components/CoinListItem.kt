package com.manuelduarte077.cryptocurrencyappyt.presentation.coin_list.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.manuelduarte077.cryptocurrencyappyt.domain.model.Coin

@Composable
@NonRestartableComposable
fun CoinListItem(
    coin: Coin,
    onItemClick: (Coin) -> Unit
) {
    Card(
        elevation = 10.dp,
        border = BorderStroke(2.dp, Color.LightGray),
        modifier = Modifier
            .clickable { onItemClick(coin) }
            .fillMaxWidth(),
        shape = RoundedCornerShape(4.dp),
    ) {
        Row(
            modifier = Modifier
                .padding(20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Text(
                text = "${coin.rank}. ${coin.name} (${coin.symbol})",
                style = MaterialTheme.typography.body1,
                color = Color.White,
                overflow = TextOverflow.Ellipsis
            )
            Text(
                text = if (coin.isActive) "active" else "inactive",
                color = if (coin.isActive) Color.Green else Color.Red,
                fontStyle = FontStyle.Normal,
                textAlign = TextAlign.End,
                style = MaterialTheme.typography.body2,
                modifier = Modifier.padding(end = 20.dp)
            )
        }
    }
    Spacer(modifier = Modifier.padding(top = 20.dp))
}