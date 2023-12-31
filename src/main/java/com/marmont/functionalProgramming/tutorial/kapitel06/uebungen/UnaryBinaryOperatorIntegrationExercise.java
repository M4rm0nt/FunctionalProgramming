package com.marmont.functionalProgramming.tutorial.kapitel06.uebungen;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryBinaryOperatorIntegrationExercise {
    public static void main(String[] args) {
        // Übung: Integrieren Sie UnaryOperator und BinaryOperator in einem Beispiel.
        // Erstellen Sie beispielsweise einen UnaryOperator, der einen Wert verdoppelt, und einen BinaryOperator, der Werte addiert.

        UnaryOperator<Integer> doubleNumber = x -> x * 2;
        BinaryOperator<Integer> addNumbers = Integer::sum;

        // Kombination der Operatoren
        int number = 5;
        int doubled = doubleNumber.apply(number);
        int sum = addNumbers.apply(doubled, number);
        System.out.println("Verdoppelt: " + doubled + ", Summe: " + sum);
    }
}