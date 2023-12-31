package com.marmont.functionalProgramming.tutorial.kapitel06.beispiele;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        // Ein BinaryOperator, der zwei Zahlen addiert
        BinaryOperator<Integer> adder = (a, b) -> a + b;

        // Anwendung des BinaryOperators
        System.out.println("Summe von 5 und 10: " + adder.apply(5, 10));
    }
}