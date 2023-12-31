package com.marmont.functionalProgramming.tutorial.kapitel06.beispiele;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        // Ein UnaryOperator, der eine Zahl verdoppelt
        UnaryOperator<Integer> doubleNumber = x -> x * 2;

        // Anwendung des UnaryOperators
        System.out.println("Das Doppelte von 5 ist: " + doubleNumber.apply(5));
    }
}