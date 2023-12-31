package com.marmont.functionalProgramming.tutorial.Kapitel01.beispiele;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        // Predicate-Interface mit Lambda-Ausdruck
        Predicate<String> isLongerThan5 = s -> s.length() > 5;

        // Testen des Predicates
        System.out.println("Ist 'HelloWorld' länger als 5 Zeichen? " + isLongerThan5.test("HelloWorld"));
    }
}