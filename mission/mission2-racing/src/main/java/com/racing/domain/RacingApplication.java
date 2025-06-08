package com.racing.domain;

import com.racing.domain.controller.RacingController;
import com.racing.domain.domain.Car.Car;
import com.racing.domain.domain.Car.Cars;
import com.racing.domain.domain.Racing;
import com.racing.domain.domain.vo.RandomValue;
import com.racing.domain.view.InputView;
import com.racing.domain.view.OutputView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RacingApplication {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        RacingController racingController = new RacingController(new Cars(cars,new RandomValue(new Random())),
                new Racing(cars), new InputView(new Scanner(System.in)), new OutputView());
        racingController.racingCar();
    }
}
