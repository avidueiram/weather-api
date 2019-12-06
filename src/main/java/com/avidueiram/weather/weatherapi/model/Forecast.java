package com.avidueiram.weather.weatherapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast {

    private double minTemperature;
    private double maxTemperature;
    private double windSpeed;
    private double precipitationProbability;
    private String weather;

    public Forecast(@JsonProperty("min_temp") double minTemperature, @JsonProperty("max_temp") double maxTemperature, @JsonProperty("wind_spd") double windSpeed, @JsonProperty("pop") double precipitationProbability, @JsonProperty("weather") Map<String, String> weatherData) {
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
        this.windSpeed = windSpeed;
        this.precipitationProbability = precipitationProbability;
        this.weather = weatherData.get("description");
    }

    public double getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(double minTemperature) {
        this.minTemperature = minTemperature;
    }

    public double getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(double maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public double getPrecipitationProbability() {
        return precipitationProbability;
    }

    public void setPrecipitationProbability(double precipitationProbability) {
        this.precipitationProbability = precipitationProbability;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    @Override
    public String toString() {
        return "Forecast{" +
                "minTemperature=" + minTemperature +
                ", maxTemperature=" + maxTemperature +
                ", windSpeed=" + windSpeed +
                ", precipitationProbability=" + precipitationProbability +
                ", weather='" + weather + '\'' +
                '}';
    }
}
