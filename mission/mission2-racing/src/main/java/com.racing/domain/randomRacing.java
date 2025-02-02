package com.racing.domain;

import java.util.Random;

public class randomRacing {
    public int chooseRandom(){

        Random random = new Random();
        return random.nextInt(9);
    }

}
