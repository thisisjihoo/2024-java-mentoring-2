package com.racing.domain.domain.vo;

import java.util.Random;

public class RandomNumberValue {
    private final int value;
    private final int MAX_RANDOM_VAL = 10;

    public RandomNumberValue(final Random random) {
        this.value = random.nextInt(MAX_RANDOM_VAL);
    }

    public int getRandomValue(){
        return value;
    }
}
