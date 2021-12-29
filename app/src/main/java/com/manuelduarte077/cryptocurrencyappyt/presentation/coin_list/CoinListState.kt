package com.manuelduarte077.cryptocurrencyappyt.presentation.coin_list

import com.manuelduarte077.cryptocurrencyappyt.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
