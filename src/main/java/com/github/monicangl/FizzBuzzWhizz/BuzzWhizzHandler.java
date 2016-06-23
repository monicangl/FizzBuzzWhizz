package com.github.monicangl.FizzBuzzWhizz;

public class BuzzWhizzHandler extends NumberHandler{
    public BuzzWhizzHandler(NumberHandler successor) {
        super(successor);
        this.result = "BuzzWhizz";
    }

    @Override
    public boolean meetCondition(int number) {
        return number % buzzNumber == 0 && number % whizzNumber == 0;
    }
}
