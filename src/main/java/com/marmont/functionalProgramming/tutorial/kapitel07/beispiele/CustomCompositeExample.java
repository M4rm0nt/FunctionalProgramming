package com.marmont.functionalProgramming.tutorial.kapitel07.beispiele;

import com.marmont.functionalProgramming.tutorial.kapitel07.interfaces.CompositeFunction;

public class CustomCompositeExample {
    public static void main(String[] args) {
        CompositeFunction<Integer> operation = CompositeFunction.<Integer>of(x -> x * 2)
                .add(x -> x + 3)
                .add(x -> x / 2);

        System.out.println("Result of composite operation: " + operation.apply(10));
    }
}