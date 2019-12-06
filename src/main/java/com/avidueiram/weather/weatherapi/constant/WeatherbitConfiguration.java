package com.avidueiram.weather.weatherapi.constant;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WeatherbitConfiguration {
    @Value("${weatherbit-api-url}")
    private String apiUrl;

    @Value("${weatherbit-api-key}")
    private String apiKey;

    @Value("${weatherbit-daily-forecast-endpoint}")
    private String dailyForecastEndpoint;

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getDailyForecastEndpoint() {
        return dailyForecastEndpoint;
    }

    public void setDailyForecastEndpoint(String dailyForecastEndpoint) {
        this.dailyForecastEndpoint = dailyForecastEndpoint;
    }
}
