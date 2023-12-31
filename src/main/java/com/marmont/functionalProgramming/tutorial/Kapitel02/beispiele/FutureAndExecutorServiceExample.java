package com.marmont.functionalProgramming.tutorial.Kapitel02.beispiele;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureAndExecutorServiceExample {
    public static void main(String[] args) throws Exception {
        // Erstellen eines ExecutorService mit einem Thread-Pool
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Ein Callable, das ein Ergebnis nach einer Verzögerung liefert
        Callable<String> callableTask = () -> {
            Thread.sleep(500);
            return "Ergebnis von Callable";
        };

        // Übergeben des Callable an den ExecutorService und Erhalten eines Future-Objekts
        Future<String> future = executorService.submit(callableTask);

        // Warten auf das Ergebnis und Ausgabe
        String result = future.get();
        System.out.println("Erhaltenes Ergebnis: " + result);

        // Schließen des ExecutorService
        executorService.shutdown();
    }
}