package com.marmont.functionalProgramming.tutorial.kapitel07.beispiele;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class CombinedFunctionalInterfacesExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("  hello", "world  ", " ", "java  ", "  functional");

        Function<String, String> trimmer = String::trim;
        Predicate<String> isNotEmpty = s -> !s.isEmpty();
        Consumer<String> printer = System.out::println;

        words.stream()
                .map(trimmer)
                .filter(isNotEmpty)
                .forEach(printer);
    }
}