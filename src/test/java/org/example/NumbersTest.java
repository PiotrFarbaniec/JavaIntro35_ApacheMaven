package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class NumbersTest {

    @Test
    void whenNumberIsEvenShouldReturnMessageAsExpectedResult() {
        // given
        int number = 8;
        String expResult = "Given number is even";

        // when
        String result = Numbers.numberVerification(number);

        // then
        Assertions.assertEquals(expResult, result);
    }

    @Test
    void whenNumberIsOddShouldReturnMessageAsExpectedResult() {
        // given
        int number = 7;
        String expResult = "Given number is odd";

        // when
        String result = Numbers.numberVerification(number);

        // then
        Assertions.assertEquals(expResult, result);
    }

    @Test
    void whenNumberIsZeroShouldReturnMessageAsExpectedResult() {
        // given
        int number = 0;
        String expResult = "Zero is an undefined number";

        // when
        String result = Numbers.numberVerification(number);

        // then
        Assertions.assertEquals(expResult, result);
    }
}