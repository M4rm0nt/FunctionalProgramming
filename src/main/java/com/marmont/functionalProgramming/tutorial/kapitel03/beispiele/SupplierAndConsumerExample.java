package com.marmont.functionalProgramming.tutorial.kapitel03.beispiele;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class SupplierAndConsumerExample {
    public static void main(String[] args) {

        Supplier<String> timeSupplier = () -> LocalDateTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss"));

        Consumer<String> timeConsumer = message -> System.out.println("["+timeSupplier.get()+"] "+message);

        Supplier<String> messageSupplier = () -> "Eine Nachricht von Supplier";

        Consumer<String> messageConsumer = message -> timeConsumer.accept("Consumer verarbeitet: " + message);

        String message = messageSupplier.get();
        messageConsumer.accept(message);

        // Erzeugen weiterer Nachrichten für den Time-Consumer
        for (int i = 0; i < 5; i++) {
            timeConsumer.accept("Message " + (i+1));
        }
    }
}