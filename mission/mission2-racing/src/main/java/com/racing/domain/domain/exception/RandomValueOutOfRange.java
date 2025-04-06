package com.racing.domain.domain.exception;

public class RandomValueOutOfRange extends IndexOutOfBoundsException {

    public RandomValueOutOfRange(){
        super("Random value is out of range.");
    }
}
