package com.tdd.exercises;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FizzBuzzWhizzTest {

    private FizzBuzzWhizz fizzBuzzWhizz;

    public FizzBuzzWhizzTest() {
        this.fizzBuzzWhizz = new FizzBuzzWhizz();
    }

    @Test
    public void should_be_able_to_return_true_if_contains_three() {
        // given
        int number = 37;

        // when
        boolean result = fizzBuzzWhizz.ContainThree(number);

        // then
        assertTrue("failure - should be true", result);
    }

    @Test
    public void should_be_able_to_return_false_if_not_contains_three() {
        // given
        int number = 18;

        // when
        boolean result = fizzBuzzWhizz.ContainThree(number);

        // then
        assertFalse("failure - should be false", result);
    }

    @Test
    public void should_be_able_to_return_true_if_times_of_three() {
        // given
        int number = 18;

        // when
        boolean result = fizzBuzzWhizz.TimesOfThree(number);

        // then
        assertTrue("failure - should be true", result);
    }

    @Test
    public void should_be_able_to_return_false_if_not_times_of_three() {
        // given
        int number = 1;

        // when
        boolean result = fizzBuzzWhizz.TimesOfThree(number);

        // then
        assertFalse("failure - should be false", result);
    }

    @Test
    public void should_be_able_to_return_true_if_times_of_five() {
        // given
        int number = 10;

        // when
        boolean result = fizzBuzzWhizz.TimesOfFive(number);

        // then
        assertTrue("failure - should be true", result);
    }

    @Test
    public void should_be_able_to_return_false_if_not_times_of_five() {
        // given
        int number = 11;

        // when
        boolean result = fizzBuzzWhizz.TimesOfFive(number);

        // then
        assertFalse("failure - should be false", result);
    }

    @Test
    public void should_be_able_to_return_true_if_times_of_seven() {
        // given
        int number = 35;

        // when
        boolean result = fizzBuzzWhizz.TimesOfSeven(number);

        // then
        assertTrue("failure - should be true", result);
    }

    @Test
    public void should_be_able_to_return_false_if_not_times_of_seven() {
        // given
        int number = 6;

        // when
        boolean result = fizzBuzzWhizz.TimesOfSeven(number);

        // then
        assertFalse("failure - should be false", result);
    }
}
