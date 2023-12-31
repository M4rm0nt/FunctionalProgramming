package com.marmont.functionalProgramming.tutorial.kapitel03.uebungen;


import java.util.function.Consumer;

public class ConsumerExercise {
    public static void main(String[] args) {
        // Übung 1: Erstellen Sie einen Consumer, der einen String in Großbuchstaben ausgibt.
        Consumer<String> uppercaseConsumer = str -> System.out.println(str.toUpperCase());
        uppercaseConsumer.accept("Hallo Welt");

        // Übung 2: Erstellen Sie einen Consumer, der ein benutzerdefiniertes Objekt verarbeitet.
        // Ihr Code hier
    }
}