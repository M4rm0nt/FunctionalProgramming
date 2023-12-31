package com.marmont.functionalProgramming.tutorial.kapitel08.uebungen;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class RealWorldFunctionalApplication {
    public static void main(String[] args) {
        // Übungsaufgabe: Entwickeln Sie eine funktionale Anwendung für einen realen Anwendungsfall.
        List<String> sentences = Arrays.asList("Hello World", "Functional Programming", "Java", "Streams");

        // Funktionale Interfaces für die Anwendung
        Function<String, String> toUpperCase = String::toUpperCase;
        Predicate<String> longerThanFive = s -> s.length() > 5;

        // Anwendung der funktionalen Interfaces auf die Liste
        sentences.stream()
                .map(toUpperCase)
                .filter(longerThanFive)
                .forEach(System.out::println);
    }
}