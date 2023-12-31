package com.marmont.functionalProgramming.tutorial.kapitel04.uebungen;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionPredicateIntegrationExercise {
    public static void main(String[] args) {
        // Übung: Kombinieren Sie Function und Predicate in einem Beispiel.
        Function<String, Integer> lengthFunction = String::length;
        Predicate<Integer> isGreaterThanFive = length -> length > 5;

        // Anwendung der Kombination
        String testString = "Hello, World!";
        if (isGreaterThanFive.test(lengthFunction.apply(testString))) {
            System.out.println("'" + testString + "' ist länger als fünf Zeichen.");
        } else {
            System.out.println("'" + testString + "' ist nicht länger als fünf Zeichen.");
        }

        // Fügen Sie hier weitere Übungen zur Kombination von Function und Predicate hinzu
    }
}