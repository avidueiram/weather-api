package com.avidueiram.weather.weatherapi.service;

import com.avidueiram.weather.weatherapi.constant.WeatherbitConfiguration;
import com.avidueiram.weather.weatherapi.model.WeekForecast;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherbitService {

    private static final Logger LOGGER = LogManager.getLogger(WeatherbitService.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private WeatherbitConfiguration weatherbitConfiguration;

    public WeekForecast getDailyForecastByCity(String city, int days) {
        String endpoint = String.format("%s%s?key=%s&lang=en&units=M&days=%s&city=%s,Chile",
                weatherbitConfiguration.getApiUrl(),
                weatherbitConfiguration.getDailyForecastEndpoint(),
                weatherbitConfiguration.getApiKey(),
                days,
                city);
        WeekForecast weekForecast;
        try {
            weekForecast = restTemplate.getForObject(endpoint, WeekForecast.class);
        } catch (Exception ex) {
            LOGGER.error("Error at WeatherbitService.getDailyForecast()", ex);
            throw ex;
        }
        return weekForecast;
    }

}
