package com.marmont.functionalProgramming.tutorial.kapitel08.beispiele;

import java.util.function.Function;

public class LambdaBestPracticesExample {
    public static void main(String[] args) {
        Function<String, Integer> lengthCalculator = String::length;

        // Effektiver Einsatz von Lambda-Ausdrücken
        System.out.println("Length of 'hello': " + lengthCalculator.apply("hello"));
    }
}