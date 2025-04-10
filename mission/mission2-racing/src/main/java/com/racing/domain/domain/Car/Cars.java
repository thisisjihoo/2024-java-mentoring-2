package com.racing.domain.domain.Car;

import com.racing.domain.domain.vo.RandomValue;

import java.util.Arrays;
import java.util.List;

public class Cars {

    private final List<Car> cars;
    private RandomValue randomValue;

    public Cars(List<Car> cars, RandomValue randomValue) {
        this.cars = cars;
        this.randomValue = randomValue;
    }

    public String[] carNameSharing(String carName) {
        return Arrays.stream(carName.split(","))
                .map(String::trim)
                .toArray(String[]::new);
    }

    public void splitCarName(String[] carName) {
        for (String name : carName) {
            cars.add(new Car(name.trim()));
        }
    }
    // List에 exepct 값 지후가 할당하고 저거랑 비교하면되잖아 list 비교하는 게있어

    public void whichCarMove() {
        for (Car car : cars) {
            moveCars(car);
        }
    }

    private void moveCars(Car car) {
        if (checkMove()) {
            car.move();
        }
    }

    private boolean checkMove() {
        return randomValue.randomValue() >= 4;
    }
}
