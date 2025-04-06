package com.racing.domain.domain.Car;

import com.racing.domain.domain.vo.RandomValue;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private List<Car> cars;
    private RandomValue randomValue;

    public Cars(List<Car> cars, RandomValue randomValue) {
        this.cars = new ArrayList<>(cars);
        this.randomValue = randomValue;
    }

    public List<Car> splitCarName(String input) {
        String[] names = input.split(",");
        List<Car> carList = new ArrayList<>();

        for (String name : names) {
            carList.add(new Car(name.trim()));
        }

        return carList;
    }

    public void moveCars(List<Car> cars) {
        for (Car car : cars) {
            int value = randomValue.randomValue();
            checkMove(value);
        }
    }

    public void checkMove(int value) {
        if (value >= 4) {
            cars.remove(0);
        }
    }
}

