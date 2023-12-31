package com.marmont.functionalProgramming.tutorial.kapitel05.interfaces;

import java.util.function.BiConsumer;

/**
 * Eine erweiterte Version des BiConsumer-Interfaces, das zusätzliche Funktionen bietet.
 * @param <T> Der erste Typ des Eingabewerts
 * @param <U> Der zweite Typ des Eingabewerts
 */
public interface EnhancedBiConsumer<T, U> extends BiConsumer<T, U> {

    // Eine zusätzliche Methode, die eine Aktion vor der Hauptoperation ausführt
    default EnhancedBiConsumer<T, U> before(BiConsumer<? super T, ? super U> beforeConsumer) {
        return (t, u) -> {
            beforeConsumer.accept(t, u);
            accept(t, u);
        };
    }

    // Eine zusätzliche Methode, die eine Aktion nach der Hauptoperation ausführt
    default EnhancedBiConsumer<T, U> after(BiConsumer<? super T, ? super U> afterConsumer) {
        return (t, u) -> {
            accept(t, u);
            afterConsumer.accept(t, u);
        };
    }
}