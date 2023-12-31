package com.marmont.functionalProgramming.tutorial.kapitel04.uebungen;

import java.util.function.Predicate;

public class PredicateExercise {
    public static void main(String[] args) {
        // Übung 1: Erstellen Sie ein Predicate, das überprüft, ob eine Zahl gerade ist.
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println("Ist 4 gerade? " + isEven.test(4));

        // Übung 2: Erstellen Sie ein Predicate, das testet, ob ein String ein bestimmtes Wort enthält.
        Predicate<String> containsWord = str -> str.contains("Java");
        System.out.println("Enthält 'Hallo, Java!' das Wort 'Java'? " + containsWord.test("Hallo, Java!"));

        // Fügen Sie hier weitere Übungen hinzu
    }
}