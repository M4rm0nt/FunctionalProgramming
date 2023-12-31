package com.marmont.functionalProgramming.tutorial.kapitel03.interfaces;

import java.util.function.Supplier;

/**
 * Eine erweiterte Version des Supplier-Interfaces, das zusätzliche Methoden bietet.
 * @param <T> Der Typ des durch den Supplier bereitgestellten Objekts
 */
public interface EnhancedSupplier<T> extends Supplier<T> {

    // Eine zusätzliche Methode, die eine vordefinierte Standardinstanz zurückgibt
    default T getDefault() {
        return createDefaultInstance();
    }

    // Hilfsmethode zur Erstellung einer Standardinstanz des Typs T
    T createDefaultInstance();
}