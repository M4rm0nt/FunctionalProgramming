package com.marmont.functionalProgramming.tutorial.kapitel04.beispiele;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        // Ein Function-Beispiel, das einen String in seine Länge umwandelt
        Function<String, Integer> lengthFunction = String::length;

        // Anwendung der Function
        String testString = "Hello, World!";
        int length = lengthFunction.apply(testString);
        System.out.println("Die Länge von '" + testString + "' ist: " + length);
    }
}