package Comparison;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

// Hjelpeklasse som implementerer Comparator-grensesnittet
class SortbyRoll implements Comparator<Student> 
{    
    // Sammenlign etter studentnummer (stigende rekkefølge)
    public int compare(Student a, Student b) {
        return b.rollno - a.rollno;
    }
}

// Definerer Student-klassen
class Student {
    int rollno;
    String name;

    // Konstruktør
    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    // Metode for å skrive ut Student-objekter
    // brukes i main()
    @Override
    public String toString() {
        return rollno + ": " + name;
    }

    public static void main(String[] args) 
    {
        // Lager en liste med studenter
        List<Student> students = new ArrayList<>();
        
        // Legger til elementer i listen
        students.add(new Student(111, "Mayank"));
        students.add(new Student(131, "Anshul"));
        students.add(new Student(121, "Solanki"));
        students.add(new Student(101, "Aggarwal"));

        // Sorterer studentene etter studentnummer
        // ved hjelp av SortbyRoll-komparatoren
        Collections.sort(students, new SortbyRoll());

        System.out.println("Sortert etter studentnummer:");

        // Itererer over listen og skriver ut innholdet
        for (int i = 0; i < students.size(); i++)
            System.out.println(students.get(i));
    }
}

// Eksempel med lambda løsning
// Definerer Student-klassen 
class Student1 {
    String name;
    Integer age;

    // Konstruktør
    Student1(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    // Metode for å skrive ut studentdetaljer
    @Override
    public String toString() {
        return name + " : " + age;
    }
    public static void main(String[] args) {
        List<Student1> students = new ArrayList<>();

        students.add(new Student1("Ajay", 27));
        students.add(new Student1("Sneha", 23));
        students.add(new Student1("Simran", 37));
        students.add(new Student1("Ankit", 22));
        students.add(new Student1("Anshul", 29));
        students.add(new Student1("Sneha", 22));

        // Original liste
        System.out.println("Original liste:");

        // Itererer gjennom listen
        for (Student1 it : students) {
            System.out.println(it);
        }

        System.out.println();

        // Sorter studentene etter navn, og deretter etter alder
        students.sort(Comparator.comparing(Student1::getName).thenComparing(Student1::getAge));

        // Vis melding etter sortering
        System.out.println("Etter sortering:");

        // Itererer gjennom listen etter sortering ved hjelp av for-each-løkke
        for (Student1 it : students) {
            System.out.println(it);
        }
}
}
