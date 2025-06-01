package com.racing.domain.domain;

import com.racing.domain.domain.Car.Car;

import java.util.ArrayList;
import java.util.List;

public class Racing {
    private final List<Car> cars;

    public Racing(List<Car> cars) {
        this.cars = cars;
    }

    public int maxMoveNumber(){
        int maxMove = 0;
        for(Car car : cars){
            maxMove = Math.max(maxMove, car.getMoveCar());
        }
        return maxMove;
    }

    public List<String> winnerName(int maxMove) {
        List<String> winners = new ArrayList<>();
        for (Car car : cars) {
            addWinner(winners, car, maxMove);
        }
        return winners;
    }

    public String listToString(List<String> carNames) {
        return String.join(", ", carNames);
    }

    private void addWinner(List<String> winners, Car car, int maxMove) {
        if (car.getMoveCar() == maxMove) {
            winners.add(car.getCarName());
        }
    }



}

