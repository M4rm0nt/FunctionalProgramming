package com.marmont.functionalProgramming.tutorial.Kapitel02.beispiele;

public class SimpleRunnableExample {
    public static void main(String[] args) {
        // Verwendung von Runnable mit einem Lambda-Ausdruck
        Runnable runnable = () -> System.out.println("Hello from Runnable!");

        // Starten eines neuen Threads mit dem Runnable
        new Thread(runnable).start();
    }
}