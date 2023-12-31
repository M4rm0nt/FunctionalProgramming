package com.marmont.functionalProgramming.tutorial.kapitel05.uebungen;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class BiConsumerBiFunctionIntegrationExercise {
    public static void main(String[] args) {
        // Übung: Integrieren Sie BiConsumer und BiFunction in einem Beispiel.
        // Erstellen Sie eine BiFunction, die zwei Werte verarbeitet, und einen BiConsumer, der das Ergebnis verarbeitet.

        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
        BiConsumer<Integer, Integer> displayMultiplication = (a, b) ->
                System.out.println(a + " * " + b + " = " + multiply.apply(a, b));

        // Anwendung der Kombination
        displayMultiplication.accept(5, 3); // Sollte "5 * 3 = 15" ausgeben
    }
}