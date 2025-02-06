package com.racing.domain.domain;

public class IllegalIndexException extends IndexOutOfBoundsException {

    public IllegalIndexException(){
        super("Out of range.");
    }
}
