package com.marmont.functionalProgramming.tutorial.kapitel08.uebungen;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionalDebuggingExercise {
    public static void main(String[] args) {
        // Übungsaufgabe: Finden und beheben Sie das Problem in der folgenden funktionalen Operation.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Funktionale Operation mit einem Fehler
        Function<Integer, Integer> multiplyByTwo = x -> x * 2;
        numbers.stream()
                .map(multiplyByTwo)
                .forEach(System.out::println);
    }
}