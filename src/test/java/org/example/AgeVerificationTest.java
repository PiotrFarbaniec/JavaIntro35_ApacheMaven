package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeVerificationTest {


    @Test
    void forAgeLessThanEighteenShouldReturnFalse() {
        // given
        int age = 17;
        boolean expectedResult = false;

        // when
        boolean result = AgeVerification.whetherThePersonIsAdult(age);

        // then
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void forAgeEqualEighteenShouldReturnTrue() {
        // given
        int age = 18;
        boolean expectedResult = true;

        // when
        boolean result = AgeVerification.whetherThePersonIsAdult(age);

        // then
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void forAgeGreaterThanEighteenShouldReturnTrue() {
        // given
        int age = 19;
        boolean expectedResult = true;

        // when
        boolean result = AgeVerification.whetherThePersonIsAdult(age);

        // then
        Assertions.assertEquals(expectedResult, result);
    }
}