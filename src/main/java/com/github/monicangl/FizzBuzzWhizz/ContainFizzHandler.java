package com.github.monicangl.FizzBuzzWhizz;

public class ContainFizzHandler extends NumberHandler{
    public ContainFizzHandler(NumberHandler successor) {
        super(successor);
        this.result = "Fizz";
    }

    @Override
    public boolean meetCondition(int number) {
        while (number > 0) {
            if (number % 10 == fizzNumber) {
                return true;
            } else {
                number /= 10;
            }
        }

        return false;
    }


}
