package com.marmont.functionalProgramming.tutorial.kapitel06.uebungen;

import java.util.function.UnaryOperator;

public class UnaryOperatorExercise {
    public static void main(String[] args) {
        // Übung 1: Erstellen Sie einen UnaryOperator, der einen String umkehrt.
        UnaryOperator<String> reverseString = s -> new StringBuilder(s).reverse().toString();
        System.out.println(reverseString.apply("Hallo"));

        // Übung 2: Erstellen Sie einen UnaryOperator, der die Quadratzahl eines Integers berechnet.
        UnaryOperator<Integer> square = x -> x * x;
        System.out.println("Quadrat von 5: " + square.apply(5));

        // Fügen Sie hier weitere Übungen hinzu
    }
}
