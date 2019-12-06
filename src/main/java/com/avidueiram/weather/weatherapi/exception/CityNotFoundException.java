package com.avidueiram.weather.weatherapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "CITY_NOT_FOUND")
public class CityNotFoundException extends Exception {
}
