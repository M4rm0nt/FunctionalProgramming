package com.marmont.functionalProgramming.tutorial.Kapitel01.uebungen;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReferencesExercise {

    public static void main(String[] args) {
        // Übung 1: Wandeln Sie den folgenden Lambda-Ausdruck in eine Methodenreferenz um
        Function<String, Integer> stringLengthLambda = s -> s.length();
        Function<String, Integer> stringLengthMethodRef = null; // TODO: Umwandeln in Methodenreferenz

        // Übung 2: Wandeln Sie den folgenden Lambda-Ausdruck in eine Methodenreferenz um
        BiFunction<String, String, String> stringConcatLambda = (a, b) -> a.concat(b);
        BiFunction<String, String, String> stringConcatMethodRef = null; // TODO: Umwandeln in Methodenreferenz

        // Testen Sie Ihre Methodenreferenzen hier
    }
}
