package com.racing.domain.domain;

import com.racing.domain.domain.vo.RandomNumber;
import com.racing.domain.domain.vo.RandomValue;
import com.racing.domain.exception.IllegalIndexException;

import java.util.List;

public class Car {

    private final RandomValue randomValue;
    private int count = Value.NEG_VAL.getValue();

    public Car(RandomValue randomValue) {
        this.randomValue = randomValue;
    }

    public int RandomNumber() {
        int number = randomValue.randomValue();
        negativeValueException(number);
        outOfRangeException(number);
        return number;
    }

    public int checkRandomValue(int random) {
        if (random > Value.SPEC_RANG.getValue()) {
            count++;
        }
        return count;
    }

    private void negativeValueException(int number){
        if (number < Value.NEG_VAL.getValue()) {
            throw new IllegalIndexException();
        }
    }

    private void outOfRangeException(int number){
        if(number > Value.OUT_RANG.getValue()){
            throw new IllegalIndexException();
        }
    }

    public int[] carsRandomValue(List<String> cars){

        int[] carsRandomValue = new int[0];
        for(int i = 0; i < cars.size(); i++){
            carsRandomValue[i] = RandomNumber();
        }
        return carsRandomValue;
    }

    public int[] checkCarMove(int[] carRandomValue){

        int[] carsMove = new int[0];
        for(int i = 0; i < carRandomValue.length; i++){
            carsMove[i] = checkRandomValue(carRandomValue[i]);
        }
        return carsMove;
    }

}
