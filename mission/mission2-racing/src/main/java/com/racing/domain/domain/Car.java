package com.racing.domain.domain;

public class Car {

    private final RandomValue randomValue;

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
            throw new RuntimeException();
        }
    }

    private void OutOfRangeException(int number){
        if(number > 9){
            throw new RuntimeException();
        }
    }


    public int checkRandomValue(int random) {
        int count = 0;
        if (random > 3) {
            count++;
        }
        return count;
    }

}
