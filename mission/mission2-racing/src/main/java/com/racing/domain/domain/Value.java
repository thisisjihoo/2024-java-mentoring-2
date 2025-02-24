package com.racing.domain.domain;

public enum Value {
    NEG_VAL(0),
    SPEC_RANG(3),
    OUT_RANG(9);

    private final int value;

    Value(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
