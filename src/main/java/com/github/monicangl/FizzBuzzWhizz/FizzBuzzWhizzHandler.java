package com.github.monicangl.FizzBuzzWhizz;

public class FizzBuzzWhizzHandler extends NumberHandler {
    public FizzBuzzWhizzHandler(NumberHandler successor) {
        super(successor);
        this.result = "FizzBuzzWhizz";
    }

    @Override
    public boolean meetCondition(int number) {
        return number % fizzNumber == 0 && number % buzzNumber == 0 && number % whizzNumber == 0;
    }
}
