package com.marmont.functionalProgramming.tutorial.kapitel05.interfaces;

import java.util.function.BiFunction;

/**
 * Eine erweiterte Version des BiFunction-Interfaces, das zusätzliche Funktionen bietet.
 * @param <T> Der erste Eingabetyp
 * @param <U> Der zweite Eingabetyp
 * @param <R> Der Rückgabetyp
 */
public interface EnhancedBiFunction<T, U, R> extends BiFunction<T, U, R> {

    // Eine Methode, um eine weitere Operation nach der BiFunction auszuführen
    default <V> BiFunction<T, U, V> andThenEnhanced(BiFunction<? super R, ? super R, ? extends V> after) {
        return (T t, U u) -> after.apply(apply(t, u), apply(t, u));
    }
}