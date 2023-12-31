package com.marmont.functionalProgramming.tutorial.kapitel03.beispiele;

import java.util.function.Supplier;
import java.util.function.Consumer;

public class SupplierAndConsumerExample {
    public static void main(String[] args) {
        // Ein Supplier, der eine Nachricht erzeugt
        Supplier<String> messageSupplier = () -> "Eine Nachricht von Supplier";

        // Ein Consumer, der die Nachricht verarbeitet
        Consumer<String> messageConsumer = message -> System.out.println("Consumer verarbeitet: " + message);

        // Kombination von Supplier und Consumer
        String message = messageSupplier.get();
        messageConsumer.accept(message);
    }
}