package com.racing.domain.domain;

import com.racing.domain.domain.vo.RandomValue;
import com.racing.domain.exception.IllegalIndexException;

public class Car {

    private final RandomValue randomValue;
    private final int NEG_VAL = 0;
    private final int SPEC_RANG = 3;
    private final int OUT_RANG = 9;
    private int count = 0;

    public Car(RandomValue randomValue) {
        this.randomValue = randomValue;
    }

    public int RandomNumber() {
        int number = randomValue.randomValue();
        NegativeValueException(number);
        OutOfRangeException(number);
        return number;
    }

    private void NegativeValueException(int number){
        if (number < NEG_VAL) {
            throw new IllegalIndexException();
        }
    }

    private void OutOfRangeException(int number){
        if(number > OUT_RANG){
            throw new IllegalIndexException();
        }
    }


    public int checkRandomValue(int random) {
        if (random > SPEC_RANG) {
            count++;
        }
        return count;
    }

}
