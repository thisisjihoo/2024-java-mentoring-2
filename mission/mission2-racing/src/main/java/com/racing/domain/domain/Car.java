package com.racing.domain.domain;

import com.racing.domain.domain.vo.RandomValue;
import com.racing.domain.exception.IllegalIndexException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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
        int[] carsRandomValue = new int[cars.size()];
        for(int i = 0; i < cars.size(); i++){
            carsRandomValue[i] = RandomNumber();
        }
        return carsRandomValue;
    }

    public int[] checkCarMove(int[] carRandomValue){
        int[] carsMove = new int[carRandomValue.length];
        for(int i = 0; i < carRandomValue.length; i++){
            carsMove[i] = checkRandomValue(carRandomValue[i]);
        }
        return carsMove;
    }

    public List<Integer> arrayAsList(int[] carsMove) {
        return Arrays.stream(carsMove).boxed().collect(Collectors.toList());
    }

    public List<String> getWinnerName(List<Integer> count, List<String> carName){
        List<String> winnerCar = new ArrayList<>();
        for(int i = 0; i < count.size(); i++){
            winnerCar = checkCount(count,carName,i);
        }
        return winnerCar;
    }

    public List<String> checkCount(List<Integer> count, List<String> carName, int number){
        List<String> winnerCar = new ArrayList<>();
        if(count.get(number) == 1) {
            winnerCar = Collections.singletonList(carName.get(number));
        }
        return winnerCar;
    }

}
