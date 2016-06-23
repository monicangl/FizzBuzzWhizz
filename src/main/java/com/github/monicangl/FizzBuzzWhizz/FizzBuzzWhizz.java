package com.github.monicangl.FizzBuzzWhizz;

public class FizzBuzzWhizz {
    public FizzBuzzWhizz() {
    }

    public void countOffNumber(int startNumber, int endNumber) {
        for (int i = startNumber; i <= endNumber; ++i) {
            System.out.println(countOffNumber(i));
        }
    }

    public String countOffNumber(int number) {
        if (containFizzNumber(number))
        {
            return "Fizz";
        }

        if (timesOfFizzBuzzWhizzNumber(number)) {
            return "FizzBuzzWhizz";
        }

        if (timesOfFizzBuzzNumber(number)) {
            return "FizzBuzz";
        }

        if (timesOfFizzWhizzNumber(number)) {
            return "FizzWhizz";
        }

        if (timesOfBuzzWhizzNumber(number)) {
            return "BuzzWhizz";
        }

        if (timesOfFizzNumber(number)) {
            return "Fizz";
        }

        if (timesOfBuzzNumber(number)) {
            return "Buzz";
        }

        if (timesOfWhizzNumber(number)) {
            return "Whizz";
        }

        return String.valueOf(number);
    }

    public boolean containFizzNumber(int number) {
        while (number > 0) {
            if (number % 10 == fizzNumber) {
                return true;
            } else {
                number /= 10;
            }
        }

        return false;
    }

    public boolean timesOfFizzNumber(int number) {return number % fizzNumber == 0;}
    public boolean timesOfBuzzNumber(int number) {
        return number % buzzNumber == 0;
    }
    public boolean timesOfWhizzNumber(int number) {
        return number % whizzNumber == 0;
    }

    public boolean timesOfFizzBuzzNumber(int number) {
        return timesOfFizzNumber(number) && timesOfBuzzNumber(number);
    }
    public boolean timesOfFizzWhizzNumber(int number) {
        return timesOfFizzNumber(number) && timesOfWhizzNumber(number);
    }
    public boolean timesOfBuzzWhizzNumber(int number) {
        return timesOfBuzzNumber(number) && timesOfWhizzNumber(number);
    }
    public boolean timesOfFizzBuzzWhizzNumber(int number) {
        return timesOfFizzNumber(number) && timesOfBuzzNumber(number) && timesOfWhizzNumber(number);
    }


    public void setFizzBuzzWhizzNumber(int fizzNumber, int buzzNumber, int whizzNumber) {
        this.fizzNumber = fizzNumber;
        this.buzzNumber = buzzNumber;
        this.whizzNumber = whizzNumber;
    }

    private int fizzNumber;
    private int buzzNumber;
    private int whizzNumber;


}
