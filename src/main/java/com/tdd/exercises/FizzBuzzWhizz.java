package com.tdd.exercises;

public class FizzBuzzWhizz {
    public FizzBuzzWhizz() {
    }

    public void CountOffNumber(int startNumber, int endNumber) {
        for (int i = startNumber; i <= endNumber; ++i) {
            System.out.println(CountOffNumber(i));
        }
    }

    public String CountOffNumber(int number) {
        if (ContainFizzNumber(number))
        {
            return "Fizz";
        }

        boolean fizz = TimesOfFizzNumber(number);
        boolean buzz = TimesOfBuzzNumber(number);
        boolean whizz = TimesOfWhizzNumber(number);

        if (fizz && buzz && whizz) {
            return "FizzBuzzWhizz";
        } else if (fizz && buzz) {
            return "FizzBuzz";
        } else if (fizz && whizz) {
            return "FizzWhizz";
        } else if (buzz && whizz) {
            return "BuzzWhizz";
        } else if (fizz) {
            return "Fizz";
        } else if (buzz) {
            return "Buzz";
        } else if (whizz) {
            return "Whizz";
        } else {
            return String.valueOf(number);
        }
    }

    public boolean ContainFizzNumber(int number) {
        while (number > 0) {
            if (number % 10 == fizzNumber) {
                return true;
            } else {
                number /= 10;
            }
        }

        return false;
    }

    public boolean TimesOfFizzNumber(int number) {
        return number % fizzNumber == 0;
    }

    public boolean TimesOfBuzzNumber(int number) {
        return number % buzzNumber == 0;
    }

    public boolean TimesOfWhizzNumber(int number) {
        return number % whizzNumber == 0;
    }

    public void SetFizzBuzzWhizzNumber(int fizzNumber, int buzzNumber, int whizzNumber) {
        this.fizzNumber = fizzNumber;
        this.buzzNumber = buzzNumber;
        this.whizzNumber = whizzNumber;
    }

    private int fizzNumber;
    private int buzzNumber;
    private int whizzNumber;
}
