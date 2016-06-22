package com.tdd.exercises;

import java.util.Scanner;

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

    public boolean InputFizzBuzzWhizzNumber() {
        Scanner s = new Scanner(System.in);
        System.out.println("please enter the Fizz, Buzz, and Whizz number separated by blank space:");
        fizzNumber = s.nextInt();
        buzzNumber = s.nextInt();
        whizzNumber = s.nextInt();

        if ((0 < fizzNumber && fizzNumber < 10)
                && (0 < buzzNumber && buzzNumber < 10)
                && (0 < whizzNumber && whizzNumber < 10)
                && (fizzNumber != buzzNumber)
                && (fizzNumber != whizzNumber)
                && (buzzNumber != whizzNumber)
                ) {
            return true;
        }

        return false;
    }

    public boolean InputCountOffStartEndNumber() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please input the count off start number, and end number separated by blank space:");
        countOffStartNumber = s.nextInt();
        countOffEndNumber = s.nextInt();

        if (0 < countOffStartNumber && countOffStartNumber <= countOffEndNumber) {
            return true;
        }

        return false;
    }

    public void CountOffNumber() {
        for (int i = countOffStartNumber; i <= countOffEndNumber; ++i) {
            System.out.println(HandleNumber(i));
        }
    }

    public String HandleNumber(int number) {
        int temp = number;
        while (temp > 0) {
            if (temp % 10 == fizzNumber) {
                return "Fizz";
            } else {
                temp /= 10;
            }
        }

        boolean fizz = (number % fizzNumber == 0);
        boolean buzz = (number % buzzNumber == 0);
        boolean whizz = (number % whizzNumber == 0);

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

    private int fizzNumber;
    private int buzzNumber;
    private int whizzNumber;
    private int countOffStartNumber;
    private int countOffEndNumber;
}
