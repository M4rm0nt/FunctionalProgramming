package com.marmont.functionalProgramming.tutorial.Kapitel01.beispiele;

import java.util.function.Function;

public class MethodReferencesExample {
    public static void main(String[] args) {
        // Methodenreferenz für eine statische Methode
        Function<String, Integer> stringLength = String::length;

        // Methodenreferenz für eine Instanzmethode eines bestimmten Objekts
        String myString = "Beispiel";
        Function<String, String> instanceMethodRef = myString::concat;

        // Ausführen der Methodenreferenzen
        System.out.println("Länge des Strings 'Test': " + stringLength.apply("Test"));
        System.out.println("Ergebnis der Instanzmethode: " + instanceMethodRef.apply(" concat"));
    }
}