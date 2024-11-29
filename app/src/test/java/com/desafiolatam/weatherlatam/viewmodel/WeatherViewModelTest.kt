package com.desafiolatam.weatherlatam.viewmodel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.desafiolatam.weatherlatam.data.repository.FakeWeatherRepository
import com.desafiolatam.weatherlatam.view.viewmodel.WeatherViewModel
import kotlinx.coroutines.flow.collectLatest
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class WeatherViewModelTest {

    @get: Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private lateinit var viewModel: WeatherViewModel

    @Before
    fun setup() {
        viewModel = WeatherViewModel(FakeWeatherRepository())
    }

    @Test
    suspend fun insertWeatherDto() {
        viewModel.getWeather().collectLatest {

        }
    }
}