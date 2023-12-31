package com.marmont.functionalProgramming.tutorial.kapitel06.interfaces;


import java.util.function.BinaryOperator;

/**
 * Eine erweiterte Version des BinaryOperator-Interfaces, das zusätzliche Funktionen bietet.
 * @param <T> Der Typ der Eingabewerte und des Ausgabewerts
 */
public interface EnhancedBinaryOperator<T> extends BinaryOperator<T> {

    // Eine Methode, die eine dritte Operation nach den zwei Hauptoperationen ausführt
    default BinaryOperator<T> followedBy(BinaryOperator<T> after) {
        return (T a, T b) -> after.apply(apply(a, b), apply(a, b));
    }
}