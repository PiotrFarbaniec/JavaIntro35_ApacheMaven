package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CalculatorTest {


    @Test
    void forValuesFiveAndFiveAndPlusOperatorShouldReturnTen() {
        // given
        double val1 = 5;
        double val2 = 5;
        char operator = '+';
        double expectedVal = 10;

        // when
        double equation = Calculator.performingCalculationsForGivenNumbers(val1, val2, operator);

        // then
        Assertions.assertEquals(expectedVal, equation);
    }

    @Test
    void forValuesFifteenAndTenAndMinusOperatorShouldReturnFive() {
        // given
        double val1 = 15;
        double val2 = 10;
        char operator = '-';
        double expectedVal = 5;

        // when
        double equation = Calculator.performingCalculationsForGivenNumbers(val1, val2, operator);

        // then
        Assertions.assertEquals(expectedVal, equation);
    }

    @Test
    void forValuesTwentyAndFourAndMultiplicationOperatorShouldReturnEighty() {
        // given
        double val1 = 20;
        double val2 = 4;
        char operator = '*';
        double expectedVal = 80;

        // when
        double equation = Calculator.performingCalculationsForGivenNumbers(val1, val2, operator);

        // then
        Assertions.assertEquals(expectedVal, equation);
    }

    @Test
    void forValuesTwentyTwoAndElevenAndDivisionOperatorShouldReturnTwo() {
        // given
        double val1 = 22;
        double val2 = 11;
        char operator = '/';
        double expectedVal = 2;

        // when
        double equation = Calculator.performingCalculationsForGivenNumbers(val1, val2, operator);

        // then
        Assertions.assertEquals(expectedVal, equation);
    }
    @Test
    void forIllegalOperatorShouldReturnNotification() {
        // given
        double val1 =2;
        double val2 =2;
        char operator = '?';

        // when
        double result = Calculator.performingCalculationsForGivenNumbers(val1, val2, operator);

        // then
        Assertions.assertNotNull(result, "Wrong operator! Allowed {'+' , '-', '*', '/'} types only");
    }
}