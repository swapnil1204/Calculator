package com.thoughtworks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void givenTwoZeros_whenAdded_shouldReturnZero() {
        Calculator calculator = new Calculator(0.0, 0.0);
        assertEquals(0.0, calculator.add());
    }

    @Test
    void givenTwoOnes_whenAdded_shouldReturnTwo() {
        Calculator calculator = new Calculator(1.0, 1.0);
        assertEquals(2.0, calculator.add());
    }

    @Test
    void givenTwoAndOne_whenAdded_shouldReturnThree() {
        Calculator calculator = new Calculator(2.0, 1.0);
        assertEquals(3.0, calculator.add());
    }
}
