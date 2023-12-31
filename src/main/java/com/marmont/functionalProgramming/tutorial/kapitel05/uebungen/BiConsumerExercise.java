package com.marmont.functionalProgramming.tutorial.kapitel05.uebungen;

import java.util.function.BiConsumer;

public class BiConsumerExercise {
    public static void main(String[] args) {
        // Übung 1: Erstellen Sie einen BiConsumer, der zwei Strings ausgibt.
        BiConsumer<String, String> printTwoStrings = (a, b) -> System.out.println(a + " und " + b);
        printTwoStrings.accept("Hallo", "Welt");

        // Übung 2: Erstellen Sie einen BiConsumer, der ein Schlüssel-Wert-Paar einer Map ausgibt.
        // Ihr Code hier
    }
}