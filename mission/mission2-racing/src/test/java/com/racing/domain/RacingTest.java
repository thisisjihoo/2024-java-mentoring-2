package com.racing.domain;

import com.racing.domain.domain.Car.Car;
import com.racing.domain.domain.Racing;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class RacingTest {
    List<Car> carList = new ArrayList<>();
    Racing racing = new Racing(carList);

    @Test
    public void winnerNameTest(){
        int maxMove = 1;
        List<String> carNames = new ArrayList<>();

    }
}
