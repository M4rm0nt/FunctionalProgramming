package com.marmont.functionalProgramming.tutorial.kapitel04.beispiele;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        // Ein Predicate-Beispiel, das überprüft, ob ein String leer ist
        Predicate<String> isEmpty = String::isEmpty;

        // Anwendung des Predicates
        String testString = "";
        boolean result = isEmpty.test(testString);
        System.out.println("Ist der String leer? " + result);
    }
}