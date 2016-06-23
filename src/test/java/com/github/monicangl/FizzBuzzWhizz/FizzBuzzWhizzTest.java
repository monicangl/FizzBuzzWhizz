package com.github.monicangl.FizzBuzzWhizz;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FizzBuzzWhizzTest {

    private FizzHandler fizzHandler;
    private ContainFizzHandler containFizzHandler;
    private FizzBuzzHandler fizzBuzzHandler;
    private FizzWhizzHandler fizzWhizzHandler;
    private BuzzWhizzHandler buzzWhizzHandler;
    private FizzBuzzWhizzHandler fizzBuzzWhizzHandler;
    private BuzzHandler buzzHandler;
    private WhizzHandler whizzHandler;

    public FizzBuzzWhizzTest() {
        this.fizzHandler = new FizzHandler(null);
        this.buzzHandler = new BuzzHandler(null);
        this.whizzHandler = new WhizzHandler(null);
        this.containFizzHandler = new ContainFizzHandler(null);
        this.fizzBuzzHandler = new FizzBuzzHandler(null);
        this.fizzWhizzHandler = new FizzWhizzHandler(null);
        this.buzzWhizzHandler = new BuzzWhizzHandler(null);
        this.fizzBuzzWhizzHandler = new FizzBuzzWhizzHandler(null);
    }

    @BeforeClass
    public static void setUpClass() {
        NumberHandler.setFizzBuzzWhizzNumber(3, 5, 7);
    }

    @Test
    public void should_be_able_to_return_true_if_contains_fizz_number() {
        // given
        int number = 37;

        // when
        boolean result = containFizzHandler.meetCondition(number);

        // then
        assertTrue("failure - should be true", result);
    }

    @Test
    public void should_be_able_to_return_false_if_not_contains_fizz_number() {
        // given
        int number = 18;

        // when
        boolean result = containFizzHandler.meetCondition(number);

        // then
        assertFalse("failure - should be false", result);
    }

    @Test
    public void should_be_able_to_return_true_if_times_of_fizz_number_and_buzz_number() {
        // given
        int number = 15;

        // when
        boolean result = fizzBuzzHandler.meetCondition(number);

        // then
        assertTrue("failure - should be true", result);
    }

    @Test
    public void should_be_able_to_return_false_if_not_times_of_fizz_number_and_buzz_number() {
        // given
        int number = 6;

        // when
        boolean result = fizzBuzzHandler.meetCondition(number);

        // then
        assertFalse("failure - should be false", result);
    }

    @Test
    public void should_be_able_to_return_true_if_times_of_fizz_number_and_whizz_number() {
        // given
        int number = 21;

        // when
        boolean result = fizzWhizzHandler.meetCondition(number);

        // then
        assertTrue("failure - should be true", result);
    }

    @Test
    public void should_be_able_to_return_false_if_not_times_of_fizz_number_and_whizz_number() {
        // given
        int number = 6;

        // when
        boolean result = fizzWhizzHandler.meetCondition(number);

        // then
        assertFalse("failure - should be false", result);
    }

    @Test
    public void should_be_able_to_return_true_if_times_of_buzz_number_and_whizz_number() {
        // given
        int number = 35;

        // when
        boolean result = buzzWhizzHandler.meetCondition(number);

        // then
        assertTrue("failure - should be true", result);
    }

    @Test
    public void should_be_able_to_return_false_if_not_times_of_buzz_number_and_whizz_number() {
        // given
        int number = 6;

        // when
        boolean result = buzzWhizzHandler.meetCondition(number);

        // then
        assertFalse("failure - should be false", result);
    }

    @Test
    public void should_be_able_to_return_true_if_times_of_fizz_number_and_buzz_number_and_whizz_number() {
        // given
        int number = 105;

        // when
        boolean result = fizzBuzzWhizzHandler.meetCondition(number);

        // then
        assertTrue("failure - should be true", result);
    }

    @Test
    public void should_be_able_to_return_false_if_not_times_of_fizz_number_and_buzz_number_and_whizz_number() {
        // given
        int number = 6;

        // when
        boolean result = fizzBuzzWhizzHandler.meetCondition(number);

        // then
        assertFalse("failure - should be false", result);
    }

    @Test
    public void should_be_able_to_return_true_if_times_of_fizz_number() {
        // given
        int number = 18;

        // when
        boolean result = fizzHandler.meetCondition(number);

        // then
        assertTrue("failure - should be true", result);
    }

    @Test
    public void should_be_able_to_return_false_if_not_times_of_fizz_number() {
        // given
        int number = 1;

        // when
        boolean result = fizzHandler.meetCondition(number);

        // then
        assertFalse("failure - should be false", result);
    }

    @Test
    public void should_be_able_to_return_true_if_times_of_buzz_number() {
        // given
        int number = 10;

        // when
        boolean result = buzzHandler.meetCondition(number);

        // then
        assertTrue("failure - should be true", result);
    }

    @Test
    public void should_be_able_to_return_false_if_not_times_of_buzz_number() {
        // given
        int number = 11;

        // when
        boolean result = buzzHandler.meetCondition(number);

        // then
        assertFalse("failure - should be false", result);
    }

    @Test
    public void should_be_able_to_return_true_if_times_of_whizz_number() {
        // given
        int number = 35;

        // when
        boolean result = whizzHandler.meetCondition(number);

        // then
        assertTrue("failure - should be true", result);
    }

    @Test
    public void should_be_able_to_return_false_if_not_times_of_whizz_number() {
        // given
        int number = 6;

        // when
        boolean result = whizzHandler.meetCondition(number);

        // then
        assertFalse("failure - should be false", result);
    }
}
