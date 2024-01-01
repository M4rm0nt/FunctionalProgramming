package com.marmont.functionalProgramming.tutorial.kapitel03.interfaces;

import java.util.function.Consumer;

/**
 * Eine erweiterte Version des Consumer-Interfaces, das zusätzliche Methoden bietet.
 * @param <T> Der Typ des Eingabewerts für den Consumer
 */
public interface EnhancedConsumer<T> extends Consumer<T> {
    // Eine zusätzliche Methode, die eine bestimmte Aktion vor der Hauptoperation ausführt
    default EnhancedConsumer<T> beforeAction(Runnable action) {
        return (T t) -> {
            action.run();
            accept(t);
        };
    }

    // Eine zusätzliche Methode, die eine bestimmte Aktion nach der Hauptoperation ausführt
    default EnhancedConsumer<T> afterAction(Runnable action) {
        return (T t) -> {
            accept(t);
            action.run();
        };
    }
}