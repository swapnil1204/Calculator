package com.thoughtworks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void givenTwoZeros_whenAdded_shouldReturnZero() {
        Calculator calculator = new Calculator(0.0, 0.0);
        assertEquals(0.0, calculator.add());
    }
}
