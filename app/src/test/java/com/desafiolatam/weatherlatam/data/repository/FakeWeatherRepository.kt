package com.desafiolatam.weatherlatam.data.repository

import com.desafiolatam.weatherlatam.data.WeatherRepository
import com.desafiolatam.weatherlatam.data.remote.ServiceResponse
import com.desafiolatam.weatherlatam.model.WeatherDto
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class FakeWeatherRepository : WeatherRepository {

    private val weatherList = mutableListOf<WeatherDto>()

    override suspend fun getRemoteWeatherData(): Flow<ServiceResponse<WeatherDto?>> {
        return flowOf()
    }

    override suspend fun getWeatherData(): Flow<List<WeatherDto>?> {
        return flowOf(weatherList)
    }

    override suspend fun getWeatherDataById(id: Int): Flow<WeatherDto?> {
        return flowOf()
    }

    override suspend fun insertData(weatherDto: WeatherDto) {
        weatherList.add(weatherDto)
    }

    override suspend fun clearAll() {
        weatherList.clear()
    }
}