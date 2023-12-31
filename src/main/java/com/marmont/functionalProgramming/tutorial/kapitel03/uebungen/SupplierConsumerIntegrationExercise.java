package com.marmont.functionalProgramming.tutorial.kapitel03.uebungen;

import java.util.function.Supplier;
import java.util.function.Consumer;

public class SupplierConsumerIntegrationExercise {
    public static void main(String[] args) {
        // Übung: Kombinieren Sie Supplier und Consumer in einer Anwendung.
        // Erstellen Sie einen Supplier, der einen Wert liefert, und einen Consumer, der diesen Wert verarbeitet.

        Supplier<String> stringSupplier = () -> "Testnachricht";
        Consumer<String> stringConsumer = System.out::println;

        // Integration von Supplier und Consumer
        String message = stringSupplier.get();
        stringConsumer.accept(message);
    }
}