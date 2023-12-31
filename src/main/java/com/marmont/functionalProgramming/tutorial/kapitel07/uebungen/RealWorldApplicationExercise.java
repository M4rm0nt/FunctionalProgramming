package com.marmont.functionalProgramming.tutorial.kapitel07.uebungen;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class RealWorldApplicationExercise {
    public static void main(String[] args) {
        // Übung: Erstellen Sie einen realen Anwendungsfall, der verschiedene funktionale Interfaces kombiniert.
        List<String> sentences = Arrays.asList("This is a test.", "  Functional programming ", "Java ", " ");

        Function<String, String> trimAndLowercase = s -> s.trim().toLowerCase();
        Predicate<String> notEmpty = s -> !s.isEmpty();
        Consumer<String> printer = System.out::println;

        // Anwendung der kombinierten Operationen auf die Liste
        sentences.stream()
                .map(trimAndLowercase)
                .filter(notEmpty)
                .forEach(printer);

        // Fügen Sie hier Ihre eigenen realen Anwendungsfälle hinzu
    }
}