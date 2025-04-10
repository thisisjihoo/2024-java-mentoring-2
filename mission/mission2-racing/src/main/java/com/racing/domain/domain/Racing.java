package com.racing.domain.domain;

import com.racing.domain.domain.Car.Car;

import java.util.List;
import java.util.stream.Collectors;

public class Racing {
    private final List<Car> cars;

    public Racing(List<Car> cars) {
        this.cars = cars;
    }

    public String[] findMoveCars() {
        List<Car> moveCars = getMoveCars();

        String[] winner = new String[moveCars.size()];
        for (int i = 0; i < moveCars.size(); i++) {
            winner[i] = moveCars.get(i).getCarName();
        }

        return winner;
    }

    private List<Car> getMoveCars() {
        return cars.stream()
                .filter(this:: isMove)
                .collect(Collectors.toList());
    }

    private boolean isMove(Car car) {
        return car.getMoveCar() == 1;
    }

    public String toStringWinner(String[] winner){
        return winner.toString();
    }
}

