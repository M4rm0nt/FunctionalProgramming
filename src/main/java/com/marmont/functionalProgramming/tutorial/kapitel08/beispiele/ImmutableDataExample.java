package com.marmont.functionalProgramming.tutorial.kapitel08.beispiele;

public class ImmutableDataExample {
    public static void main(String[] args) {
        final int immutableValue = 5;

        // Demonstration der Unveränderlichkeit
        System.out.println("Immutable Value: " + immutableValue);

        // immutableValue = 10; // Dies würde einen Kompilierfehler verursachen
    }
}