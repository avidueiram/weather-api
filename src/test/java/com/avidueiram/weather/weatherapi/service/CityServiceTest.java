package com.avidueiram.weather.weatherapi.service;

import com.avidueiram.weather.weatherapi.constant.Constants;
import com.avidueiram.weather.weatherapi.entity.City;
import com.avidueiram.weather.weatherapi.repository.CityRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class CityServiceTest {

    @InjectMocks
    private CityService cityService;

    @Mock
    private CityRepository cityRepository;

    @Test
    public void isShouldReturnCityWhenGetById() {
        City city = new City(1, Constants.CITIES[0]);
        when(cityRepository.findById(1)).thenReturn(Optional.of(city));
        assertThat(cityService.getById(1)).isEqualTo(city);
    }

    @Test
    public void isShouldReturnCityWhenGetByIdNull() {
        cityRepository.findById(1);
        when(cityRepository.findById(1)).thenReturn(Optional.empty());
        assertThat(cityService.getById(1)).isEqualTo(null);
    }
}
