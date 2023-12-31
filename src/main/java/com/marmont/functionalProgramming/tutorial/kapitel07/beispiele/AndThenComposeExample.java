package com.marmont.functionalProgramming.tutorial.kapitel07.beispiele;


import java.util.function.Function;

public class AndThenComposeExample {
    public static void main(String[] args) {
        Function<Integer, Integer> multiplyByTwo = x -> x * 2;
        Function<Integer, Integer> subtractThree = x -> x - 3;

        Function<Integer, Integer> combinedAndThen = multiplyByTwo.andThen(subtractThree);
        Function<Integer, Integer> combinedCompose = multiplyByTwo.compose(subtractThree);

        System.out.println("Combined using andThen: " + combinedAndThen.apply(5));
        System.out.println("Combined using compose: " + combinedCompose.apply(5));
    }
}