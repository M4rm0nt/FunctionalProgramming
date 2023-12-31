package com.marmont.functionalProgramming.tutorial.kapitel08.beispiele;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEfficiencyExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java", "stream", "functional");

        // Effiziente Nutzung von Streams
        List<String> uppercaseWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(uppercaseWords);
    }
}