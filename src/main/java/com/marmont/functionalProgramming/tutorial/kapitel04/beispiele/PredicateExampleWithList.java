package com.marmont.functionalProgramming.tutorial.kapitel04.beispiele;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExampleWithList {
    public static void main(String[] args) {
        Predicate<String> isNotEmpty = str -> !str.isEmpty();

        // Anwendung des Predicates auf eine Liste von Strings
        List<String> testStrings = List.of("Hallo", "", "Welt", "Java", "", "Funktionale", "Programmierung");
        List<String> nonEmptyStrings = testStrings.stream()
                .filter(isNotEmpty)
                .collect(Collectors.toList());

        System.out.println(nonEmptyStrings);  // Druckt: [Hallo, Welt, Java, Funktionale, Programmierung]
    }
}