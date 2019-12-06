package com.avidueiram.weather.weatherapi.repository;

import com.avidueiram.weather.weatherapi.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
}
