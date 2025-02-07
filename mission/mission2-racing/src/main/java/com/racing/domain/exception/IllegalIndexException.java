package com.racing.domain.exception;

public class IllegalIndexException extends IndexOutOfBoundsException {

    public IllegalIndexException(){
        super("Out of range.");
    }
}
