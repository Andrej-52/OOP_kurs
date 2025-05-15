package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTerminalOperationsExample {
    public static void main(String[] args) {
        // Eksempeldata
        List<String> names = Arrays.asList(
            "Reflection", "Collection", "Stream",
            "Structure", "Sorting", "State"
        );

        // forEach: Skriv ut hvert navn
        System.out.println("forEach:");
        names.stream().forEach(System.out::println);

        // collect: Samle navn som starter med 'S' i en liste
        List<String> sNames = names.stream()
                                   .filter(name -> name.startsWith("S"))
                                   .collect(Collectors.toList());
        System.out.println("\ncollect (navn som starter med 'S'):");
        sNames.forEach(System.out::println);

        // reduce: Slå sammen alle navn til én enkelt streng
        String concatenatedNames = names.stream().reduce(
            "hei",
            (partialString, element) -> partialString + " " + element
        );
        System.out.println("\nreduce (sammenslåtte navn):");
        System.out.println(concatenatedNames.trim());

        // count: Tell antall navn
        long count = names.stream().count();
        System.out.println("\ncount:");
        System.out.println(count);

        // findFirst: Finn det første navnet
        Optional<String> firstName = names.stream().findFirst();
        System.out.println("\nfindFirst:");
        firstName.ifPresent(System.out::println);

        // allMatch: Sjekk om alle navn starter med 'S'
        boolean allStartWithS = names.stream().allMatch(
            name -> name.startsWith("S")
        );
        System.out.println("\nallMatch (alle starter med 'S'):");
        System.out.println(allStartWithS);

        // anyMatch: Sjekk om noen navn starter med 'S'
        boolean anyStartWithS = names.stream().anyMatch(
            name -> name.startsWith("S")
        );
        System.out.println("\nanyMatch (noen starter med 'S'):");
        System.out.println(anyStartWithS);
    }
}
