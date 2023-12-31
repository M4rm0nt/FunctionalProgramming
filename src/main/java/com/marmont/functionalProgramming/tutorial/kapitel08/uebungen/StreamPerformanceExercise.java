package com.marmont.functionalProgramming.tutorial.kapitel08.uebungen;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPerformanceExercise {
    public static void main(String[] args) {
        // Übungsaufgabe: Optimieren Sie die folgende Stream-Operation für bessere Performance.
        List<String> words = Arrays.asList("Stream", "Performance", "Java", "Functional", "Programming");

        // Stream-Operation, die optimiert werden soll
        List<String> processedWords = words.stream()
                .map(String::toLowerCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(processedWords);
    }
}