package com.marmont.functionalProgramming.tutorial.kapitel07.uebungen;

import java.util.function.Function;

public class CompositeOperationsExercise {
    public static void main(String[] args) {
        Function<String, String> upperAndTrim = ((Function<String, String>) String::toUpperCase)
                .andThen(String::trim);

        System.out.println(upperAndTrim.apply("  Hello World  "));
    }
}