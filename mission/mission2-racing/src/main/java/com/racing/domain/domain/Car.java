package com.racing.domain.domain;

import com.racing.domain.domain.vo.RandomValue;

public class Car {

    private final RandomValue randomValue;
    private int count = 0;

    public Car(RandomValue randomValue) {
        this.randomValue = randomValue;
    }

    public int RandomNumber() {
        int number = randomValue.setRandomValue();
        NegativeValueException(number);
        OutOfRangeException(number);
        return number;
    }

    private void NegativeValueException(int number){
        if (number < 0) {
            throw new IllegalIndexException();
        }
    }

    private void OutOfRangeException(int number){
        if(number > 9){
            throw new IllegalIndexException();
        }
    }


    public int checkRandomValue(int random) {
        if (random > 3) {
            count++;
        }
        return count;
    }

}
