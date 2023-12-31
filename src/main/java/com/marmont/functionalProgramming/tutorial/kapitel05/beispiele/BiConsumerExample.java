package com.marmont.functionalProgramming.tutorial.kapitel05.beispiele;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        // Ein BiConsumer, der zwei Zahlen addiert und das Ergebnis ausgibt
        BiConsumer<Integer, Integer> addAndPrint = (a, b) -> System.out.println("Summe: " + (a + b));

        // Anwendung des BiConsumers
        addAndPrint.accept(5, 10); // Sollte "Summe: 15" ausgeben
    }
}