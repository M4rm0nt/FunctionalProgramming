package com.marmont.functionalProgramming.tutorial.kapitel03.beispiele;

import com.marmont.functionalProgramming.tutorial.kapitel03.interfaces.EnhancedConsumer;

import java.util.function.Consumer;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ConsumerExample {
    public static void main(String[] args) {

        Consumer<String> einfacherAusgeber = System.out::println;
        einfacherAusgeber.accept("Hello, Consumer!");

        Consumer<String> grossbuchstabenAusgeber = text -> System.out.println(text.toUpperCase());
        grossbuchstabenAusgeber.accept("Hallo Welt");

        Consumer<String> erstbuchstabeGrossAusgeber = text -> System.out.println(text.substring(0, 1).toUpperCase() + text.substring(1));
        erstbuchstabeGrossAusgeber.accept("yeah baby");

        Consumer<String> wortanzahlAusgeber = str -> System.out.println("Anzahl der Worte: " + str.split(" ").length);
        wortanzahlAusgeber.accept("Dieser Satz enthält fünf Wörter.");

        Consumer<String> zeichenanzahlAusgeber = str -> System.out.println("Anzahl der Zeichen: " + str.length());
        zeichenanzahlAusgeber.accept("Dieser Satz enthält 30 Zeichen.");

        Consumer<String> umfassenderInfoAusgeber = wortanzahlAusgeber.andThen(zeichenanzahlAusgeber);
        umfassenderInfoAusgeber.accept("Dieser Satz enthält fünf Wörter.");

        Consumer<String> jedesWortAnfangsGrossAusgeber = text -> {
            String bearbeiteterText = Arrays.stream(text.split(" "))
                    .map(wort -> wort.substring(0, 1).toUpperCase() + wort.substring(1))
                    .collect(Collectors.joining(" "));
            System.out.println(bearbeiteterText);
        };

        jedesWortAnfangsGrossAusgeber.accept("yeah baby");

        // Verwenden Sie einen EnhancedConsumer anstelle von Consumer
        EnhancedConsumer<String> einfacherAusgeberw = System.out::println;

        // Setzen Sie eine Aktion vor und nach dem Ausdruck einfacherAusgeber
        EnhancedConsumer<String> umfassenderAusgeber = einfacherAusgeberw.beforeAction(() -> System.out.println("Vor der Operation..."));
        umfassenderAusgeber = umfassenderAusgeber.afterAction(() -> System.out.println("Nach der Operation..."));

        umfassenderAusgeber.accept("Hello, EnhancedConsumer!");
    }
}