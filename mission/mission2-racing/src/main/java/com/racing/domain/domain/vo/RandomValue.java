package com.racing.domain.domain.vo;

import java.util.Random;

public class RandomValue implements RandomNumber {

    private final RandomNumberValue randomNumberValue;

    public RandomValue(Random random) {
        this.randomNumberValue = new RandomNumberValue(random);
    }

    @Override
    public int randomValue() {
        return randomNumberValue.getRandomValue();
    }
}
