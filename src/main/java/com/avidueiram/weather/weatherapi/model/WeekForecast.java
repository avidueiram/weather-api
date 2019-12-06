package com.avidueiram.weather.weatherapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class WeekForecast {
    private List<Forecast> forecasts;

    public WeekForecast(@JsonProperty("data") List<Forecast> forecasts) {
        this.forecasts = forecasts;
    }

    public List<Forecast> getForecasts() {
        return forecasts;
    }

    public void setForecasts(List<Forecast> forecasts) {
        this.forecasts = forecasts;
    }

    @Override
    public String toString() {
        return "DailyForecast{" +
                "forecasts=" + forecasts +
                '}';
    }
}
