package com.tdd.exercises;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FizzBuzzWhizzTest {

    private FizzBuzzWhizz fizzBuzzWhizz;

    public FizzBuzzWhizzTest() {
        this.fizzBuzzWhizz = new FizzBuzzWhizz();
    }

    @Before
    public void setUp() {
        fizzBuzzWhizz.SetFizzBuzzWhizzNumber(3, 5, 7);
    }

    @Test
    public void should_be_able_to_return_true_if_contains_fizz_number() {
        // given
        int number = 37;

        // when
        boolean result = fizzBuzzWhizz.ContainFizzNumber(number);

        // then
        assertTrue("failure - should be true", result);
    }

    @Test
    public void should_be_able_to_return_false_if_not_contains_fizz_number() {
        // given
        int number = 18;

        // when
        boolean result = fizzBuzzWhizz.ContainFizzNumber(number);

        // then
        assertFalse("failure - should be false", result);
    }

    @Test
    public void should_be_able_to_return_true_if_times_of_fizz_number() {
        // given
        int number = 18;

        // when
        boolean result = fizzBuzzWhizz.TimesOfFizzNumber(number);

        // then
        assertTrue("failure - should be true", result);
    }

    @Test
    public void should_be_able_to_return_false_if_not_times_of_fizz_number() {
        // given
        int number = 1;

        // when
        boolean result = fizzBuzzWhizz.TimesOfFizzNumber(number);

        // then
        assertFalse("failure - should be false", result);
    }

    @Test
    public void should_be_able_to_return_true_if_times_of_buzz_number() {
        // given
        int number = 10;

        // when
        boolean result = fizzBuzzWhizz.TimesOfBuzzNumber(number);

        // then
        assertTrue("failure - should be true", result);
    }

    @Test
    public void should_be_able_to_return_false_if_not_times_of_buzz_number() {
        // given
        int number = 11;

        // when
        boolean result = fizzBuzzWhizz.TimesOfBuzzNumber(number);

        // then
        assertFalse("failure - should be false", result);
    }

    @Test
    public void should_be_able_to_return_true_if_times_of_whizz_number() {
        // given
        int number = 35;

        // when
        boolean result = fizzBuzzWhizz.TimesOfWhizzNumber(number);

        // then
        assertTrue("failure - should be true", result);
    }

    @Test
    public void should_be_able_to_return_false_if_not_times_of_whizz_number() {
        // given
        int number = 6;

        // when
        boolean result = fizzBuzzWhizz.TimesOfWhizzNumber(number);

        // then
        assertFalse("failure - should be false", result);
    }
}
