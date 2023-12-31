package com.marmont.functionalProgramming.tutorial.kapitel06.beispiele;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryAndBinaryOperatorExample {
    public static void main(String[] args) {
        // Ein UnaryOperator, der eine Zahl verdoppelt
        UnaryOperator<Integer> doubleNumber = x -> x * 2;

        // Ein BinaryOperator, der zwei Zahlen addiert
        BinaryOperator<Integer> adder = (a, b) -> a + b;

        // Kombination von UnaryOperator und BinaryOperator
        int number = 5;
        int doubled = doubleNumber.apply(number);
        int sum = adder.apply(doubled, number);

        System.out.println("Original: " + number + ", Verdoppelt: " + doubled + ", Summe: " + sum);
    }
}