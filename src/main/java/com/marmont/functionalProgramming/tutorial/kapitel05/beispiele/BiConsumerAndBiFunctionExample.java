package com.marmont.functionalProgramming.tutorial.kapitel05.beispiele;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class BiConsumerAndBiFunctionExample {
    public static void main(String[] args) {
        // Ein BiFunction, das zwei Zahlen multipliziert
        BiFunction<Integer, Integer, Integer> multiplier = (a, b) -> a * b;

        // Ein BiConsumer, der das Ergebnis der Multiplikation ausgibt
        BiConsumer<Integer, Integer> printMultiplication = (a, b) ->
                System.out.println(a + " * " + b + " = " + multiplier.apply(a, b));

        // Kombinierte Anwendung von BiFunction und BiConsumer
        printMultiplication.accept(3, 4); // Sollte "3 * 4 = 12" ausgeben
    }
}