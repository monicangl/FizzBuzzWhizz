package com.tdd.exercises;

public class FizzBuzzWhizz {
    public FizzBuzzWhizz(int fizzNumber, int buzzNumber, int whizzNumber) {
        this.fizzNumber = fizzNumber;
        this.buzzNumber = buzzNumber;
        this.whizzNumber = whizzNumber;
    }

    public FizzBuzzWhizz(int fizzNumber, int buzzNumber, int whizzNumber, int countOffStartNumber, int countOffEndNumber) {
        this(fizzNumber, buzzNumber, whizzNumber);
        this.countOffStartNumber = countOffStartNumber;
        this.countOffEndNumber = countOffEndNumber;
    }

    public FizzBuzzWhizz() {
    }

    public void CountOffNumber() {
        for (int i = countOffStartNumber; i <= countOffEndNumber; ++i) {
            System.out.println(HandleNumber(i));
        }
    }

    public String HandleNumber(int number) {
        if (ContainThree(number))
        {
            return "Fizz";
        }

        boolean fizz = TimesOfThree(number);
        boolean buzz = TimesOfFive(number);
        boolean whizz = TimesOfSeven(number);

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

    public boolean ContainThree(int number) {
        while (number > 0) {
            if (number % 10 == 3) {
                return true;
            } else {
                number /= 10;
            }
        }

        return false;
    }

    public boolean TimesOfThree(int number) {
        return number % 3 == 0;
    }

    public boolean TimesOfFive(int number) {
        return number % 5 == 0;
    }

    public boolean TimesOfSeven(int number) {
        return number % 7 == 0;
    }

    private int fizzNumber;
    private int buzzNumber;
    private int whizzNumber;
    private int countOffStartNumber;
    private int countOffEndNumber;
}
