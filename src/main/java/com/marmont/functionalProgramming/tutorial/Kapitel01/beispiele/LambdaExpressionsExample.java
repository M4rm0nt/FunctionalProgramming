package com.marmont.functionalProgramming.tutorial.Kapitel01.beispiele;

import java.util.function.Consumer;

public class LambdaExpressionsExample {
    public static void main(String[] args) {
        // Ein einfacher Lambda-Ausdruck ohne Parameter
        Runnable noArguments = () -> System.out.println("Lambda ohne Parameter");

        // Lambda-Ausdruck mit einem Parameter
        Consumer<String> oneArgument = (String s) -> System.out.println(s);

        // Lambda-Ausdruck mit mehreren Anweisungen
        Consumer<String> complexLambda = (String s) -> {
            System.out.println("Mehrere Anweisungen in einem Lambda:");
            System.out.println(s);
        };

        // Ausführen der Lambdas
        noArguments.run();
        oneArgument.accept("Lambda mit einem Parameter");
        complexLambda.accept("Komplexes Lambda");
    }
}