package com.marmont.functionalProgramming.tutorial.kapitel03.beispiele;


import java.util.function.Supplier;
import java.time.LocalDate;

public class SupplierExample {
    public static void main(String[] args) {
        // Ein Supplier, der das aktuelle Datum liefert
        Supplier<LocalDate> dateSupplier = LocalDate::now;

        // Verwendung des Suppliers, um das heutige Datum zu erhalten
        LocalDate today = dateSupplier.get();
        System.out.println("Heutiges Datum: " + today);
    }
}