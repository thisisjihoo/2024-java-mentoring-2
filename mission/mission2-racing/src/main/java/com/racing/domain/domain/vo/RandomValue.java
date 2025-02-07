package com.racing.domain.domain.vo;

import java.util.Random;

public class RandomValue implements RandomNumber {

    private final Random random;
    private final int MAX_RANDOM_VAL = 10;

    public RandomValue(Random random) {
        this.random = random;
    }

    @Override
    public int randomValue() {
        return random.nextInt(MAX_RANDOM_VAL);
    }
}
