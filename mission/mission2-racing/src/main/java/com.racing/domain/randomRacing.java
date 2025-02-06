package com.racing.domain;

import java.util.Random;

public class randomRacing {

    public int chooseRandom(){

        Random random = new Random();
        return random.nextInt(9);
    }

    public int checkRandomValue(int random){

        int count = 0;

        if(random > 3){
            count += 1;
        }
        return count;
    }
}
