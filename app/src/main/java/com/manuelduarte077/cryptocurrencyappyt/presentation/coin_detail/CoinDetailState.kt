package com.manuelduarte077.cryptocurrencyappyt.presentation.coin_detail

import com.manuelduarte077.cryptocurrencyappyt.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
