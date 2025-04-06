package com.racing.domain.domain.Car;

import java.util.List;

public class Car {

    private int OVER_NAME_LENGTH = 5;
    private int MOVE_CAR = 0;

    public final String carName;
    public int moveCar;

    public Car(String carName) {
        validateNameLength(carName);
        this.carName = carName;
        this.moveCar = MOVE_CAR;
    }

    public String getCarName() {
        return carName;
    }

    public int getMoveCar() {
        return moveCar;
    }

    public void move() {
        moveCar++;
    }

    public void validateNameLength(String name) {
        if (name.length() > OVER_NAME_LENGTH) {
            throw new IllegalArgumentException("Car name is too long.");
        }
    }
}
