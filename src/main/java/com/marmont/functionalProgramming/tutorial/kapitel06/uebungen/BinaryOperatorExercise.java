package com.marmont.functionalProgramming.tutorial.kapitel06.uebungen;

import java.util.function.BinaryOperator;

public class BinaryOperatorExercise {
    public static void main(String[] args) {
        // Übung 1: Erstellen Sie einen BinaryOperator, der das Maximum zweier Zahlen findet.
        BinaryOperator<Integer> maxOperator = Integer::max;
        System.out.println("Max von 5 und 10: " + maxOperator.apply(5, 10));

        // Übung 2: Erstellen Sie einen BinaryOperator, der zwei Strings konkateniert.
        BinaryOperator<String> concatStrings = String::concat;
        System.out.println(concatStrings.apply("Hallo ", "Welt"));

        // Fügen Sie hier weitere Übungen hinzu
    }
}