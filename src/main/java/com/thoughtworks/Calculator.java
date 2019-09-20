package com.thoughtworks;

public class Calculator {
    private final double firstValue;
    private final double secondValue;

    public Calculator(double firstValue, double secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public double add() {
        return firstValue+secondValue;
    }

    public double subtract() {
        return firstValue-secondValue;
    }

    public double multiply() {
        return 0.0;
    }
}
