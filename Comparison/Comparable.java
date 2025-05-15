package Comparison;

import java.util.Arrays;

// Klassen Pair implementerer Comparable for å kunne sammenligne objekter
class Pair implements Comparable<Pair> {
    String f; // Fornavn
    String l; // Etternavn

    // Konstruktør
    public Pair(String f, String l) {
        this.f = f;
        this.l = l;
    }

    // toString()-metode for å vise Pair-objektet som tekst
    @Override
    public String toString() {
        return "(" + f + ", " + l + ")";
    }

    // compareTo-metode for sammenligningslogikk
    @Override
    public int compareTo(Pair p) {
        // Sammenlign basert på fornavn (i leksikografisk rekkefølge)
        if (this.f.compareTo(p.f) != 0) {
            return this.f.compareTo(p.f);
        }

        // Hvis fornavnene er like, sammenlign basert på etternavn
        return this.l.compareTo(p.l);
    }

    public static void main(String[] args) {
        // Opprett et array med Pair-objekter
        Pair[] p = {
            new Pair("raj", "kashup"),
            new Pair("rahul", "singh"),
            new Pair("reshmi", "dubey"),
        };

        // Vis listen før sortering
        System.out.println("Før sortering:");
        for (Pair p1 : p) {
            System.out.println(p1);
        }

        // Sorter arrayet med Pair-objekter
        Arrays.sort(p);

        // Vis listen etter sortering
        System.out.println("\nEtter sortering:");
        for (Pair p1 : p) {
            System.out.println(p1);
        }
    }
}
