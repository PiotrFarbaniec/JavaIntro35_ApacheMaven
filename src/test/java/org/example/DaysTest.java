package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DaysTest {

    @Test
    void whenGivenNumberIsOneShouldReturnMonday() {
        // given
        int dayNumber = 1;
        String expResult = "Monday";

        // when
        String result = Days.whatDayOfWeek(dayNumber);

        //then
        Assertions.assertEquals(expResult, result);
    }

    @Test
    void whenGivenNumberIsTwoShouldReturnTuesday() {
        // given
        int dayNumber = 2;
        String expResult = "Tuesday";

        // when
        String result = Days.whatDayOfWeek(dayNumber);

        //then
        Assertions.assertEquals(expResult, result);
    }

    @Test
    void whenGivenNumberIsThreeShouldReturnWednesday() {
        // given
        int dayNumber = 3;
        String expResult = "Wednesday";

        // when
        String result = Days.whatDayOfWeek(dayNumber);

        //then
        Assertions.assertEquals(expResult, result);
    }

    @Test
    void whenGivenNumberIsFourShouldReturnThursday() {
        // given
        int dayNumber = 4;
        String expResult = "Thursday";

        // when
        String result = Days.whatDayOfWeek(dayNumber);

        //then
        Assertions.assertEquals(expResult, result);
    }

    @Test
    void whenGivenNumberIsFiveShouldReturnFriday() {
        // given
        int dayNumber = 5;
        String expResult = "Friday";

        // when
        String result = Days.whatDayOfWeek(dayNumber);

        //then
        Assertions.assertEquals(expResult, result);
    }

    @Test
    void whenGivenNumberIsSixShouldReturnWeekend() {
        // given
        int dayNumber = 6;
        String expResult = "Weekend";

        // when
        String result = Days.whatDayOfWeek(dayNumber);

        //then
        Assertions.assertEquals(expResult, result);
    }

    @Test
    void whenGivenNumberIsSevenShouldReturnWeekend() {
        // given
        int dayNumber = 7;
        String expResult = "Weekend";

        // when
        String result = Days.whatDayOfWeek(dayNumber);

        //then
        Assertions.assertEquals(expResult, result);
    }

    @Test
    void inOtherCasesShouldReturnExpectedMessage() {
        // given
        int dayNumber1 = -1;
        int dayNumber2 = 0;
        int dayNumber3 = 8;
        String expResult = "There is no such a day!";

        // when
        String result1 = Days.whatDayOfWeek(dayNumber1);
        String result2 = Days.whatDayOfWeek(dayNumber2);
        String result3 = Days.whatDayOfWeek(dayNumber3);

        //then
        Assertions.assertEquals(expResult, result1);
        Assertions.assertEquals(expResult, result2);
        Assertions.assertEquals(expResult, result3);
    }
}