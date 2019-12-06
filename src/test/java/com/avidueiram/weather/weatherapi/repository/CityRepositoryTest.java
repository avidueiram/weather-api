package com.avidueiram.weather.weatherapi.repository;

import com.avidueiram.weather.weatherapi.constant.Constants;
import com.avidueiram.weather.weatherapi.entity.City;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CityRepositoryTest {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private CityRepository cityRepository;

    @Test
    public void isShouldGetCityById() {
        City city = new City();
        city.setId(1);
        city.setName(Constants.CITIES[0]);
        // city = entityManager.persistAndFlush(city);
        assertThat(cityRepository.findById(city.getId()).get()).isEqualTo(city);
        assertThat(cityRepository.findById(city.getId()).get().getName()).isEqualTo(city.getName());
        assertThat(cityRepository.findById(city.getId()).get().toString()).isEqualTo(city.toString());
    }
}
