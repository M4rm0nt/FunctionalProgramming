package com.marmont.functionalProgramming.tutorial.kapitel07.uebungen;

import java.util.function.Function;

public class AndThenComposeExercise {
    public static void main(String[] args) {
        // Übung: Erstellen Sie Funktionen und kombinieren Sie diese mit andThen und compose.
        Function<String, String> addExclamation = s -> s + "!";
        Function<String, String> toUpperCase = String::toUpperCase;

        // Kombinieren der Funktionen
        Function<String, String> shout = addExclamation.andThen(toUpperCase);
        Function<String, String> enthusiasticGreeting = addExclamation.compose(toUpperCase);

        // Testen der kombinierten Funktionen
        System.out.println(shout.apply("hello"));
        System.out.println(enthusiasticGreeting.apply("hello"));

        // Fügen Sie hier Ihre eigenen Übungen hinzu
    }
}