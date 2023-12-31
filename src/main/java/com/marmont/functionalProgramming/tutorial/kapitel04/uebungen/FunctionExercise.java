package com.marmont.functionalProgramming.tutorial.kapitel04.uebungen;

import java.util.function.Function;

public class FunctionExercise {
    public static void main(String[] args) {
        // Übung 1: Erstellen Sie eine Function, die Strings in ihre Länge umwandelt.
        Function<String, Integer> stringLengthFunction = String::length;
        System.out.println("Länge von 'Hello': " + stringLengthFunction.apply("Hello"));

        // Übung 2: Erstellen Sie eine Function, die Integer verdoppelt.
        Function<Integer, Integer> doubleFunction = x -> x * 2;
        System.out.println("Das Doppelte von 4 ist: " + doubleFunction.apply(4));

        // Fügen Sie hier weitere Übungen hinzu
    }
}