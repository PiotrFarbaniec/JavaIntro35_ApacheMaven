package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class NumbersTest {

    @Test
    void whenNumberIsEvenShouldReturnMessageAsExpectedResult() {
        // given
        int number = 8;
        boolean expResult = true;

        // when
        boolean result = Numbers.isNumberEven(number);

        // then
        Assertions.assertEquals(expResult, result);
    }

    @Test
    void whenNumberIsOddShouldReturnMessageAsExpectedResult() {
        // given
        int number = 7;
        boolean expResult = false;

        // when
        boolean result = Numbers.isNumberEven(number);

        // then
        Assertions.assertEquals(expResult, result);
    }

    @Test
    void whenNumberIsZeroShouldReturnMessageAsExpectedResult() {
        // given
        int number = 0;
        boolean expResult = false;

        // when
        boolean result = Numbers.isNumberEven(number);

        // then
        Assertions.assertEquals(expResult, result);
    }
}