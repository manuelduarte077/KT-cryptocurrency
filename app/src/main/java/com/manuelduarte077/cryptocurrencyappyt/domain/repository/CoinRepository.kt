package com.manuelduarte077.cryptocurrencyappyt.domain.repository

import com.manuelduarte077.cryptocurrencyappyt.data.remote.dto.CoinDetailDto
import com.manuelduarte077.cryptocurrencyappyt.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}