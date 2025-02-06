package com.racing.domain.domain.vo;

import java.util.Random;

public class RandomValue implements RandomNumber {


    private final Random random;

    public RandomValue(Random random) {
        this.random = random;
    }

    @Override
    public int setRandomValue() {
        return random.nextInt(9);
    }
}
