package com.marmont.functionalProgramming.tutorial.Kapitel02.interfaces;

import java.util.concurrent.Callable;

/**
 * Eine Erweiterung des Callable-Interfaces, das zusätzliche Funktionalitäten bietet.
 * @param <V> Der Rückgabetyp des Callable
 */
public interface CustomCallable<V> extends Callable<V> {

    // Eine zusätzliche Methode, die vor der call-Methode aufgerufen werden kann
    default void beforeCall() {
        System.out.println("Aktionen vor dem Aufruf");
    }

    // Eine zusätzliche Methode, die nach der call-Methode aufgerufen werden kann
    default void afterCall() {
        System.out.println("Aktionen nach dem Aufruf");
    }

    // Überschreiben der call-Methode, um beforeCall und afterCall einzubeziehen
    @Override
    default V call() throws Exception {
        beforeCall();
        V result = execute();
        afterCall();
        return result;
    }

    // Die Hauptausführungsmethode, die von konkreten Implementierungen definiert wird
    V execute() throws Exception;
}
