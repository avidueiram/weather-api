package com.avidueiram.weather.weatherapi.entity;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
public class CityTest {

    @Test
    public void itShouldEqualsFalse1() {
        City cityA = new City();
        Object cityB = new Object();
        assertThat(cityA.equals(cityB)).isEqualTo(false);
    }

    @Test
    public void itShouldEqualsFalse2() {
        City cityA = new City(1, "Ciudad A");
        City cityB = new City(2, "Ciudad B");
        assertThat(cityA.equals(cityB)).isEqualTo(false);
    }
}
