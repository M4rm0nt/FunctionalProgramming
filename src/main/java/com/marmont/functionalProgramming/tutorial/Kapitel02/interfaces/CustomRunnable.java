package com.marmont.functionalProgramming.tutorial.Kapitel02.interfaces;

/**
 * Eine Erweiterung des Runnable-Interfaces, das zusätzliche Funktionalitäten bietet.
 */
public interface CustomRunnable extends Runnable {

    // Eine zusätzliche Methode, die vor der run-Methode aufgerufen werden kann
    default void beforeRun() {
        System.out.println("Aktionen vor der Ausführung");
    }

    // Eine zusätzliche Methode, die nach der run-Methode aufgerufen werden kann
    default void afterRun() {
        System.out.println("Aktionen nach der Ausführung");
    }

    // Überschreiben der run-Methode, um beforeRun und afterRun einzubeziehen
    @Override
    default void run() {
        beforeRun();
        execute();
        afterRun();
    }

    // Die Hauptausführungsmethode, die von konkreten Implementierungen definiert wird
    void execute();
}