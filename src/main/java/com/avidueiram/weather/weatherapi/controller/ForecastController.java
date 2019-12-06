package com.avidueiram.weather.weatherapi.controller;

import com.avidueiram.weather.weatherapi.constant.Constants;
import com.avidueiram.weather.weatherapi.entity.City;
import com.avidueiram.weather.weatherapi.exception.CityIdNotValidException;
import com.avidueiram.weather.weatherapi.exception.CityNotFoundException;
import com.avidueiram.weather.weatherapi.model.WeekForecast;
import com.avidueiram.weather.weatherapi.service.CityService;
import com.avidueiram.weather.weatherapi.service.WeatherbitService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/forecasts")
public class ForecastController {

    private static final Logger LOGGER = LogManager.getLogger(ForecastController.class);

    @Autowired
    private CityService cityService;

    @Autowired
    private WeatherbitService weatherbitService;

    @RequestMapping(method = RequestMethod.GET, value = "/{cityId}/week")
    public WeekForecast getWeekByCityId(@PathVariable int cityId) throws CityIdNotValidException, CityNotFoundException {
        if (cityId < 1) {
            LOGGER.error("CityIdNotValidException -> cityId less than 1");
            throw new CityIdNotValidException();
        }
        City city = cityService.getById(cityId);
        if (city == null) {
            LOGGER.error("CityNotFoundException -> cityId not found in database");
            throw new CityNotFoundException();
        }
        WeekForecast weekForecast = weatherbitService.getDailyForecastByCity(Constants.CITIES[cityId - 1], 7);
        if (weekForecast == null) {
            LOGGER.error("CityNotFoundException -> city not found in weatherbit daily forecast service");
            throw new CityNotFoundException();
        }
        return weekForecast;
    }
}
