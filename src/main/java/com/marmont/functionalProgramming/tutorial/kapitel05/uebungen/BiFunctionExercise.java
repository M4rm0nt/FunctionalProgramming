package com.marmont.functionalProgramming.tutorial.kapitel05.uebungen;

import java.util.function.BiFunction;

public class BiFunctionExercise {
    public static void main(String[] args) {
        // Übung 1: Erstellen Sie eine BiFunction, die zwei Zahlen addiert und das Ergebnis zurückgibt.
        BiFunction<Integer, Integer, Integer> adder = (a, b) -> a + b;
        System.out.println("Summe von 5 und 10: " + adder.apply(5, 10));

        // Übung 2: Erstellen Sie eine BiFunction, die zwei Objekte eines benutzerdefinierten Typs kombiniert.
        // Ihr Code hier
    }
}