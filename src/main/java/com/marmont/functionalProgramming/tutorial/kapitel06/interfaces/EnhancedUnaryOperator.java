package com.marmont.functionalProgramming.tutorial.kapitel06.interfaces;


import java.util.function.UnaryOperator;

/**
 * Eine erweiterte Version des UnaryOperator-Interfaces, das zusätzliche Funktionen bietet.
 * @param <T> Der Typ des Eingabe- und Ausgabewerts
 */
public interface EnhancedUnaryOperator<T> extends UnaryOperator<T> {

    // Eine Methode, um die Operation mehrmals auszuführen
    default UnaryOperator<T> repeat(int times) {
        return t -> {
            T result = t;
            for (int i = 0; i < times; i++) {
                result = apply(result);
            }
            return result;
        };
    }
}