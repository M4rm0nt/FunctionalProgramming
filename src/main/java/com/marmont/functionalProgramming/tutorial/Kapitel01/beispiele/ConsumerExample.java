package com.marmont.functionalProgramming.tutorial.Kapitel01.beispiele;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        // Consumer-Interface mit Lambda-Ausdruck
        Consumer<String> consumer = s -> System.out.println("Eingabe: " + s);

        // Verwendung des Consumers
        consumer.accept("Test");
    }
}
