package com.github.monicangl.FizzBuzzWhizz;

public abstract class NumberHandler {
    public NumberHandler(NumberHandler successor) {
        this.successor = successor;
    }

    public static void setFizzBuzzWhizzNumber(int fizzNumber, int buzzNumber, int whizzNumber) {
        NumberHandler.fizzNumber = fizzNumber;
        NumberHandler.buzzNumber = buzzNumber;
        NumberHandler.whizzNumber = whizzNumber;
    }

    public  String handleNumber(int number) {
        if (meetCondition(number)) {
            return result;
        }
        else {
            return successor.handleNumber(number);
        }
    }

    public abstract boolean meetCondition(int number);

    protected static int fizzNumber;
    protected static int buzzNumber;
    protected static int whizzNumber;

    protected String result;
    protected NumberHandler successor;
}
