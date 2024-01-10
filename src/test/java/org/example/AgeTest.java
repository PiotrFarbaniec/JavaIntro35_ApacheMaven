package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AgeTest {


    @Test
    void forAgeLessThanEighteenShouldReturnFalse() {
        // given
        int age = 17;
        boolean expectedResult = false;

        // when
        boolean result = Age.checkIfAdult(age);

        // then
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void forAgeEqualEighteenShouldReturnTrue() {
        // given
        int age = 18;
        boolean expectedResult = true;

        // when
        boolean result = Age.checkIfAdult(age);

        // then
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void forAgeGreaterThanEighteenShouldReturnTrue() {
        // given
        int age = 19;
        boolean expectedResult = true;

        // when
        boolean result = Age.checkIfAdult(age);

        // then
        Assertions.assertEquals(expectedResult, result);
    }
}