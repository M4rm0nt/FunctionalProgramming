package com.marmont.functionalProgramming.tutorial.Kapitel01.interfaces;

/**
 * Ein Beispiel für ein funktionales Interface in Java.
 * Es ist mit der Annotation @FunctionalInterface markiert,
 * was darauf hinweist, dass das Interface genau eine abstrakte Methode enthält.
 */
@FunctionalInterface
public interface FunctionalInterfaceExample {

    /**
     * Eine abstrakte Methode, die von diesem funktionalen Interface definiert wird.
     *
     * @param input ein Eingabeparameter
     * @return ein Ergebnis basierend auf dem Eingabeparameter
     */
    String process(String input);

    // Weitere Standard- oder statische Methoden können hier definiert werden,
    // ohne die Definition als funktionales Interface zu beeinträchtigen.
}