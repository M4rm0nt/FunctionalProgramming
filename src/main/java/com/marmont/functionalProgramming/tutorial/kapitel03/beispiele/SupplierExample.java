package com.marmont.functionalProgramming.tutorial.kapitel03.beispiele;


import java.util.UUID;
import java.util.function.Supplier;
import java.time.LocalDate;

public class SupplierExample {
    public static void main(String[] args) {

        Supplier<LocalDate> datumSupplier = LocalDate::now;
        LocalDate today = datumSupplier.get();
        System.out.println("Heutiges Datum: " + today);

        Supplier<Double> zufallszahlZulieferer = Math::random;
        double zufallszahl = zufallszahlZulieferer.get();
        System.out.println("Zufallszahl: " + zufallszahl);

        Supplier<String> uuidSupplier = () -> UUID.randomUUID().toString();
        String uuid = uuidSupplier.get();
        System.out.println("Erzeugte UUID: " + uuid);

        Supplier<String> greetingSupplier = () -> "Hallo Welt!";
        String greeting = greetingSupplier.get();
        System.out.println("Gruß: " + greeting);

        Supplier<String> fizzBuzzLikeSupplier = new Supplier<>() {
            private int count = 1;

            @Override
            public String get() {
                if (count % 3 == 0) {
                    count++;
                    return "Fizz";
                } else if (count % 5 == 0) {
                    count++;
                    return "Buzz";
                } else {
                    return Integer.toString(count++);
                }
            }
        };

        for (int i = 0; i < 15; i++) {
            System.out.println("FizzBuzzLike Zahl: " + fizzBuzzLikeSupplier.get());
        }
    }
}