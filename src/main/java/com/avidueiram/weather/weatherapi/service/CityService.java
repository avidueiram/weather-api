package com.avidueiram.weather.weatherapi.service;

import com.avidueiram.weather.weatherapi.entity.City;
import com.avidueiram.weather.weatherapi.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;

    public City getById(int id) {
        return cityRepository.findById(id).orElse(null);
    }
}
