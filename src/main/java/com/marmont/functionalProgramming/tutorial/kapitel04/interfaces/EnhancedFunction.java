package com.marmont.functionalProgramming.tutorial.kapitel04.interfaces;

import java.util.function.Function;

/**
 * Eine erweiterte Version des Function-Interfaces, das zusätzliche Funktionen bietet.
 * @param <T> Der Eingabetyp der Funktion
 * @param <R> Der Ausgabetyp der Funktion
 */
public interface EnhancedFunction<T, R> extends Function<T, R> {

    // Eine zusätzliche Methode, die die Funktion invertiert
    default Function<R, T> invert() {
        // Eine Beispiel-Implementierung könnte eine Ausnahme werfen, da die Invertierung nicht immer möglich ist
        throw new UnsupportedOperationException("Invertierung nicht unterstützt");
    }

    // Eine Methode, um eine weitere Operation nach der Funktion auszuführen
    default <V> EnhancedFunction<T, V> andThenEnhanced(Function<? super R, ? extends V> after) {
        return (T t) -> after.apply(apply(t));
    }
}