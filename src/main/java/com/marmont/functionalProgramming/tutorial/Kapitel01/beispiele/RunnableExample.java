package com.marmont.functionalProgramming.tutorial.Kapitel01.beispiele;

public class RunnableExample {
    public static void main(String[] args) {
        // Runnable mit Lambda-Ausdruck
        Runnable runnable = () -> System.out.println("Runnable mit Lambda");

        // Ausführen des Runnables in einem Thread
        new Thread(runnable).start();
    }
}