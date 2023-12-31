package com.marmont.functionalProgramming.tutorial.kapitel05.beispiele;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        // Ein BiFunction, der zwei Strings konkateniert
        BiFunction<String, String, String> concat = (a, b) -> a + b;

        // Anwendung der BiFunction
        String result = concat.apply("Hallo ", "Welt!");
        System.out.println(result); // Sollte "Hallo Welt!" ausgeben
    }
}