package com.racing.domain.domain;

public class IllegalIndexException extends IndexOutOfBoundsException {

    public IllegalIndexException(){
        super("범위를 벗어났습니다.");
    }
}
