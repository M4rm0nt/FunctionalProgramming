package com.marmont.functionalProgramming.tutorial.kapitel04.beispiele;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionAndPredicateExample {
    public static void main(String[] args) {
        // Ein Function-Beispiel
        Function<String, Integer> lengthFunction = String::length;

        // Ein Predicate-Beispiel
        Predicate<String> isNotEmpty = str -> !str.isEmpty();

        // Kombination von Function und Predicate
        String testString = "Hello";
        if (isNotEmpty.test(testString)) {
            int length = lengthFunction.apply(testString);
            System.out.println("Die Länge von '" + testString + "' ist: " + length);
        } else {
            System.out.println("Der String ist leer.");
        }
    }
}