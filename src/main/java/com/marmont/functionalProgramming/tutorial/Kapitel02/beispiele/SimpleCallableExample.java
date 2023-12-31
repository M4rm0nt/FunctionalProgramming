package com.marmont.functionalProgramming.tutorial.Kapitel02.beispiele;

import java.util.concurrent.Callable;

public class SimpleCallableExample {
    public static void main(String[] args) throws Exception {
        // Verwendung von Callable mit einem Lambda-Ausdruck, der einen Wert zurückgibt
        Callable<String> callable = () -> {
            // Simuliert eine Aufgabe, die etwas Zeit benötigt
            Thread.sleep(1000);
            return "Ergebnis von Callable";
        };

        // Aufrufen der call-Methode des Callables und Ausgeben des Ergebnisses
        String result = callable.call();
        System.out.println(result);
    }
}