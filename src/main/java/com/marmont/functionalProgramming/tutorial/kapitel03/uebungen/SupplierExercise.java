package com.marmont.functionalProgramming.tutorial.kapitel03.uebungen;

import java.util.function.Supplier;

public class SupplierExercise {
    public static void main(String[] args) {
        // Übung 1: Erstellen Sie einen Supplier, der eine Zufallszahl liefert.
        Supplier<Double> randomSupplier = Math::random;
        System.out.println("Zufallszahl: " + randomSupplier.get());

        // Übung 2: Erstellen Sie einen Supplier, der ein neues Objekt einer benutzerdefinierten Klasse liefert.
        // Ihr Code hier
    }
}