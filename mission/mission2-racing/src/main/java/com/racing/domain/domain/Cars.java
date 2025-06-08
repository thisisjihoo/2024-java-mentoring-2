package com.racing.domain.domain;

public class Cars {

    public String[] carNameSharing(String carName){
        return carName.split(",");
    }

    public int countCars(String[] carName){
        int count = 0;
        for(int i = 0; i < carName.length; i++){
            count++;
        }
        return count;
    }
}
