package com.racing.domain;

import com.racing.domain.controller.RacingController;
import com.racing.domain.domain.Car;
import com.racing.domain.domain.RandomValue;
import com.racing.domain.view.InputView;
import com.racing.domain.view.OutputView;

import java.util.Random;

public class RacingApplication {
    private final RandomValue randomValue;
    private final Random random;

    public RacingApplication(RandomValue randomValue, Random random) {
        this.randomValue = randomValue;
        this.random = random;
    }

    public static void main(String[] args) {
        RacingController racingController = new RacingController(new Car(new RandomValue(new Random())), new InputView(), new OutputView());
        racingController.Racing();
    }
}
