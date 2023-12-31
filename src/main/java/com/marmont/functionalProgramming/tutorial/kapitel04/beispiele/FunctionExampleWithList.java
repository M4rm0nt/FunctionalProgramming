package com.marmont.functionalProgramming.tutorial.kapitel04.beispiele;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExampleWithList {
    public static void main(String[] args) {
        Function<String, Integer> lengthFunction = String::length;

        // Anwendung der Function auf eine Liste von Strings
        List<String> testStrings = List.of("Hallo", "Welt", "Java", "Funktionale", "Programmierung");
        List<Integer> lengths = testStrings.stream()
                .map(lengthFunction)
                .collect(Collectors.toList());

        System.out.println(lengths);  // Druckt: [5, 5, 4, 12, 14]
    }
}