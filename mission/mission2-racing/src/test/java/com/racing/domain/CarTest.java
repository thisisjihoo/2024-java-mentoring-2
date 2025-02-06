package com.racing.domain;

import com.racing.domain.domain.Car;
import com.racing.domain.domain.RandomValue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @Test
    public void check() {
        Random random = new Random();
        RandomValue randomValue = new RandomValue(random);
        Car car = new Car(randomValue);
        int firstRandom = 4;
        int secondRandom = 1;

        int exceptFirst = 1;
        int exceptSecond = 0;

        int resultFirst = car.checkRandomValue(firstRandom);
        int resultSecond = car.checkRandomValue(secondRandom);


        Assertions.assertAll(
                ()-> assertEquals(exceptFirst,resultFirst),
                ()-> assertEquals(exceptSecond,resultSecond)
        );
    }
}
