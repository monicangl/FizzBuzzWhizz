package com.github.monicangl.FizzBuzzWhizz;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(FizzBuzzWhizzTest.class);
        System.out.println("Running count:      " + result.getRunCount());
        System.out.println("Ignored count:      " + result.getIgnoreCount());
        System.out.println("Successful count:   " + (result.getRunCount() - result.getIgnoreCount() - result.getFailureCount()));
        System.out.println("Failed count:       " + result.getFailureCount());

        if (result.getFailureCount() > 0) {
            System.out.println("Failed information:");
            for (Failure failure : result.getFailures()) {
                System.out.println(failure.toString());
            }
        }
    }
}
