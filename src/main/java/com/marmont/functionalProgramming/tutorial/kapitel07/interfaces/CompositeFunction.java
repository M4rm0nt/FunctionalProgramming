package com.marmont.functionalProgramming.tutorial.kapitel07.interfaces;

import java.util.function.Function;

public interface CompositeFunction<T> extends Function<T, T> {

    default Function<T, T> add(Function<T, T> other) {
        return t -> other.apply(this.apply(t));
    }

    static <T> Function<T, T> of(Function<T, T> initial) {
        return initial::apply;
    }
}