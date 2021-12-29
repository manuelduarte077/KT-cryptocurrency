package com.manuelduarte077.cryptocurrencyappyt.data.repository

import com.manuelduarte077.cryptocurrencyappyt.data.remote.CoinPaprikaApi
import com.manuelduarte077.cryptocurrencyappyt.data.remote.dto.CoinDetailDto
import com.manuelduarte077.cryptocurrencyappyt.data.remote.dto.CoinDto
import com.manuelduarte077.cryptocurrencyappyt.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}