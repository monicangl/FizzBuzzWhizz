package com.tdd.exercises;

import org.junit.After;
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
        fizzBuzzWhizz.setFizzBuzzWhizzNumber(3, 5, 7);
    }

    @After
    public void tearDown() {

    }

    @Test
    public void should_be_able_to_return_true_if_contains_fizz_number() {
        // given
        int number = 37;

        // when
        boolean result = fizzBuzzWhizz.containFizzNumber(number);

        // then
        assertTrue("failure - should be true", result);
    }

    @Test
    public void should_be_able_to_return_false_if_not_contains_fizz_number() {
        // given
        int number = 18;

        // when
        boolean result = fizzBuzzWhizz.containFizzNumber(number);

        // then
        assertFalse("failure - should be false", result);
    }

    @Test
    public void should_be_able_to_return_true_if_times_of_fizz_number_and_buzz_number() {
        // given
        int number = 15;

        // when
        boolean result = fizzBuzzWhizz.timesOfFizzBuzzNumber(number);

        // then
        assertTrue("failure - should be true", result);
    }

    @Test
    public void should_be_able_to_return_false_if_not_times_of_fizz_number_and_buzz_number() {
        // given
        int number = 6;

        // when
        boolean result = fizzBuzzWhizz.timesOfFizzBuzzNumber(number);

        // then
        assertFalse("failure - should be false", result);
    }

    @Test
    public void should_be_able_to_return_true_if_times_of_fizz_number_and_whizz_number() {
        // given
        int number = 21;

        // when
        boolean result = fizzBuzzWhizz.timesOfFizzWhizzNumber(number);

        // then
        assertTrue("failure - should be true", result);
    }

    @Test
    public void should_be_able_to_return_false_if_not_times_of_fizz_number_and_whizz_number() {
        // given
        int number = 6;

        // when
        boolean result = fizzBuzzWhizz.timesOfFizzWhizzNumber(number);

        // then
        assertFalse("failure - should be false", result);
    }

    @Test
    public void should_be_able_to_return_true_if_times_of_buzz_number_and_whizz_number() {
        // given
        int number = 35;

        // when
        boolean result = fizzBuzzWhizz.timesOfBuzzWhizzNumber(number);

        // then
        assertTrue("failure - should be true", result);
    }

    @Test
    public void should_be_able_to_return_false_if_not_times_of_buzz_number_and_whizz_number() {
        // given
        int number = 6;

        // when
        boolean result = fizzBuzzWhizz.timesOfBuzzWhizzNumber(number);

        // then
        assertFalse("failure - should be false", result);
    }

    @Test
    public void should_be_able_to_return_true_if_times_of_fizz_number_and_buzz_number_and_whizz_number() {
        // given
        int number = 105;

        // when
        boolean result = fizzBuzzWhizz.timesOfFizzBuzzWhizzNumber(number);

        // then
        assertTrue("failure - should be true", result);
    }

    @Test
    public void should_be_able_to_return_false_if_not_times_of_fizz_number_and_buzz_number_and_whizz_number() {
        // given
        int number = 6;

        // when
        boolean result = fizzBuzzWhizz.timesOfFizzBuzzWhizzNumber(number);

        // then
        assertFalse("failure - should be false", result);
    }

    @Test
    public void should_be_able_to_return_true_if_times_of_fizz_number() {
        // given
        int number = 18;

        // when
        boolean result = fizzBuzzWhizz.timesOfFizzNumber(number);

        // then
        assertTrue("failure - should be true", result);
    }

    @Test
    public void should_be_able_to_return_false_if_not_times_of_fizz_number() {
        // given
        int number = 1;

        // when
        boolean result = fizzBuzzWhizz.timesOfFizzNumber(number);

        // then
        assertFalse("failure - should be false", result);
    }

    @Test
    public void should_be_able_to_return_true_if_times_of_buzz_number() {
        // given
        int number = 10;

        // when
        boolean result = fizzBuzzWhizz.timesOfBuzzNumber(number);

        // then
        assertTrue("failure - should be true", result);
    }

    @Test
    public void should_be_able_to_return_false_if_not_times_of_buzz_number() {
        // given
        int number = 11;

        // when
        boolean result = fizzBuzzWhizz.timesOfBuzzNumber(number);

        // then
        assertFalse("failure - should be false", result);
    }

    @Test
    public void should_be_able_to_return_true_if_times_of_whizz_number() {
        // given
        int number = 35;

        // when
        boolean result = fizzBuzzWhizz.timesOfWhizzNumber(number);

        // then
        assertTrue("failure - should be true", result);
    }

    @Test
    public void should_be_able_to_return_false_if_not_times_of_whizz_number() {
        // given
        int number = 6;

        // when
        boolean result = fizzBuzzWhizz.timesOfWhizzNumber(number);

        // then
        assertFalse("failure - should be false", result);
    }
}
