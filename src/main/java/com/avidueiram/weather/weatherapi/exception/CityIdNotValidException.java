package com.avidueiram.weather.weatherapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "CITY_ID_NOT_VALID")
public class CityIdNotValidException extends Exception {
}
