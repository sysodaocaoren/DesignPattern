package com.zym.demo.pattendemo.interpreter;

public class IntOperation implements Operation {

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public IntOperation(int value) {
        this.value = value;
    }

    @Override
    public int interpreter() {
        return value;
    }
}
