package com.marmont.functionalProgramming.tutorial.kapitel04.beispiele;

import com.marmont.functionalProgramming.tutorial.kapitel04.interfaces.EnhancedFunction;
import com.marmont.functionalProgramming.tutorial.kapitel04.interfaces.EnhancedPredicate;

public class EnhancedExamples {
    public static void main(String[] args) {
        EnhancedPredicate<String> stringHasAtLeastFiveCharacters = str -> str.length() >= 5;
        EnhancedPredicate<String> stringStartsWithA = str -> str.startsWith("A");

        // Verwendung von andEnhanced zum Überprüfen, ob eine Zeichenkette mindestens 5 Zeichen enthält und mit 'A' beginnt
        EnhancedPredicate<String> combinedPredicate = stringHasAtLeastFiveCharacters.andEnhanced(stringStartsWithA);

        boolean predicateResult = combinedPredicate.test("Hallo");
        System.out.println(predicateResult);  // Druckt: "false", da die Zeichenkette "Hallo" nicht mit "A" beginnt.

        EnhancedFunction<String, Integer> lengthFunction = String::length;
        EnhancedFunction<Integer, String> stringFunction = Object::toString;
        EnhancedFunction<String, String> combinedFunction = lengthFunction.andThenEnhanced(stringFunction);

        String functionResult = combinedFunction.apply("Hallo Welt");
        System.out.println(functionResult);  // Druckt: "10"
    }
}