package com.avidueiram.weather.weatherapi;

import com.avidueiram.weather.weatherapi.constant.Constants;
import com.avidueiram.weather.weatherapi.entity.City;
import com.avidueiram.weather.weatherapi.repository.CityRepository;
import com.avidueiram.weather.weatherapi.service.WeatherbitService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeatherApiApplication implements CommandLineRunner {

	private static final Logger LOGGER = LogManager.getLogger(WeatherApiApplication.class);

	@Autowired
	private CityRepository cityRepository;

	public static void main(String[] args) {
		SpringApplication.run(WeatherApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// This is to emulate an external database
		for (int i = 0; i < Constants.CITIES.length; i++) {
			City city = new City(i + 1, Constants.CITIES[i]);
			cityRepository.save(city);
		}
		LOGGER.info("H2 DB Ready - City count: " + cityRepository.count());
	}
}
