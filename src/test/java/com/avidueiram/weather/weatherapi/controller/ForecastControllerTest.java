package com.avidueiram.weather.weatherapi.controller;

import com.avidueiram.weather.weatherapi.constant.Constants;
import com.avidueiram.weather.weatherapi.entity.City;
import com.avidueiram.weather.weatherapi.model.WeekForecast;
import com.avidueiram.weather.weatherapi.repository.CityRepository;
import com.avidueiram.weather.weatherapi.service.CityService;
import com.avidueiram.weather.weatherapi.service.WeatherbitService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(ForecastController.class)
public class ForecastControllerTest {
    @MockBean
    private CityService cityService;

    @MockBean
    private CityRepository cityRepository;

    @MockBean
    private WeatherbitService weatherbitService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void itShouldReturnDailyForecastByCityId() throws Exception {
        City city = new City(1, Constants.CITIES[0]);
        when(cityService.getById(1)).thenReturn(city);
        when(weatherbitService.getDailyForecastByCity(Constants.CITIES[0], 7)).thenReturn(new WeekForecast(new ArrayList<>()));
        mockMvc.perform(get("/forecasts/1/week"))
                .andExpect(status().isOk());
    }

    @Test
    public void itShouldReturnDailyForecastByCityIdWithExceptionCityIdNotValid() throws Exception {
        mockMvc.perform(get("/forecasts/0/week"))
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void itShouldReturnDailyForecastByCityIdWithExceptionCityNotFound1() throws Exception {
        when(cityService.getById(1)).thenReturn(null);
        mockMvc.perform(get("/forecasts/1000/week"))
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void itShouldReturnDailyForecastByCityIdWithExceptionCityNotFound2() throws Exception {
        City city = new City(1, Constants.CITIES[0]);
        when(cityService.getById(1)).thenReturn(city);
        when(weatherbitService.getDailyForecastByCity(Constants.CITIES[0], 7)).thenReturn(null);
        mockMvc.perform(get("/forecasts/1/week"))
                .andExpect(status().is4xxClientError());
    }
}
