package br.com.udemy.calculatorapp.service;

import br.com.udemy.calculatorapp.exception.UnsupportedMathOperationException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MathServiceTest {

    private final MathService mathService = new MathService();

    @Test
    public void should_sum_two_values_when_numbers_been_valid() {
        String validNumber1 = "2";
        String validNumber2 = "6";
        Double expectedResult = 8.0;

        Double resultSum = mathService.sum(validNumber1, validNumber2);

        assertEquals(expectedResult, resultSum);
    }

    @Test
    public void should_subtract_two_values_when_numbers_been_valid() {
        String validNumber1 = "49";
        String validNumber2 = "45";
        Double expectedResult = 4.0;

        Double resultSum = mathService.subtract(validNumber1, validNumber2);

        assertEquals(expectedResult, resultSum);
    }

    @Test
    public void should_divide_two_values_when_numbers_been_valid() {
        String validNumber1 = "6";
        String validNumber2 = "2";
        Double expectedResult = 3.0;

        Double resultSum = mathService.divide(validNumber1, validNumber2);

        assertEquals(expectedResult, resultSum);
    }

    @Test
    public void should_multiply_two_values_when_numbers_been_valid() {
        String validNumber1 = "6";
        String validNumber2 = "2";
        Double expectedResult = 12.0;

        Double resultSum = mathService.multiply(validNumber1, validNumber2);

        assertEquals(expectedResult, resultSum);
    }

    @Test
    public void should_square_two_values_when_numbers_been_valid() {
        String validNumber1 = "49";
        Double expectedResult = 7.0;

        Double resultSum = mathService.square(validNumber1);

        assertEquals(expectedResult, resultSum);
    }

    @Test
    public void should_average_two_values_when_numbers_been_valid() {
        String validNumber1 = "7";
        String validNumber2 = "6";
        Double expectedResult = 6.5;

        Double resultSum = mathService.average(validNumber1, validNumber2);

        assertEquals(expectedResult, resultSum);
    }

    @Test
    public void should_throw_UnsupportedMathOperationException_when_numbers_are_invalids() {
        String validNumber1 = "j";
        String validNumber2 = "a";

        assertThrows(UnsupportedMathOperationException.class, () -> mathService.average(validNumber1, validNumber2));
    }

}