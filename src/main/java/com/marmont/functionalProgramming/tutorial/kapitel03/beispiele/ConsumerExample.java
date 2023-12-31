package com.marmont.functionalProgramming.tutorial.kapitel03.beispiele;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        // Ein Consumer, der einen String ausgibt
        Consumer<String> stringConsumer = System.out::println;

        // Verwendung des Consumers, um einen String auszugeben
        stringConsumer.accept("Hello, Consumer!");
    }
}