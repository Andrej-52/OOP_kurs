package Streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamIntermediateOperationsExample {
    public static void main(String[] args) {
        // Liste av lister med navn
        List<List<String>> listOfLists = Arrays.asList(
            Arrays.asList("Reflection", "Collection", "Stream"),
            Arrays.asList("Structure", "State", "Flow"),
            Arrays.asList("Sorting", "Mapping", "Reduction", "Stream")
        );

        // Opprett et sett for å holde mellomresultater
        Set<String> intermediateResults = new HashSet<>();

        // Stream-kjede som demonstrerer ulike mellomliggende operasjoner
        List<String> result = listOfLists.stream()
            .flatMap(List::stream)               // Flatt ut liste av lister til én strøm
            .filter(element -> element.startsWith("S"))      // Filtrer elementer som starter med "S"
            .map(String::toUpperCase)                           // Gjør hvert element om til store bokstaver
            // .map(string -> string.toUpperCase())          // Akkurat likt som forrige linjen, bare forskjellig type notasjon av lambda
            .peek(s -> intermediateResults.add(s)) // Utfør en handling (legg til i settet) på hvert element
            .distinct()                          // Fjern duplikate elementer
            .sorted()                            // Sorter elementene
            .collect(Collectors.toList());          // Samle det endelige resultatet i en liste
            // .toList();                           // kan brukes i stedt for .collect(Collectors.toList())

        // Skriv ut mellomresultatene
        System.out.println("Mellomresultater:");
        intermediateResults.forEach(System.out::println);

        // Skriv ut det endelige resultatet
        System.out.println("Endelig resultat:");
        result.forEach(System.out::println);
    }
}
