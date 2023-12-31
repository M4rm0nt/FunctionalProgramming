package com.marmont.functionalProgramming.tutorial.kapitel04.interfaces;

import java.util.function.Predicate;

/**
 * Eine erweiterte Version des Predicate-Interfaces, das zusätzliche Funktionen bietet.
 * @param <T> Der Typ des Eingabewerts für das Prädikat
 */
public interface EnhancedPredicate<T> extends Predicate<T> {

    // Eine Methode, um das Prädikat zu negieren
    default EnhancedPredicate<T> negateEnhanced() {
        return (t) -> !test(t);
    }

    // Eine Methode, um ein weiteres Prädikat hinzuzufügen
    default EnhancedPredicate<T> andEnhanced(EnhancedPredicate<? super T> other) {
        return (t) -> test(t) && other.test(t);
    }

    // Eine Methode, um ein alternatives Prädikat hinzuzufügen
    default EnhancedPredicate<T> orEnhanced(EnhancedPredicate<? super T> other) {
        return (t) -> test(t) || other.test(t);
    }
}