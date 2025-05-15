package Iteration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


class IterateUsingEnhancedForLoop { 
    public static void main(String[] args) { 
        
        // Oppretter en liste
        List<String> list = new ArrayList<String>(); 

        // Legger til elementer
        list.add("Geeks"); 
        list.add("for"); 
        list.add("Geeks"); 

        // Går gjennom listen med forbedret for-løkke (enhanced for-loop)
        for (String element : list) { 
            System.out.println(element); 
        } 
    } 
} 

class IterateUsingIterator { 
    public static void main(String[] args) { 
        
        // Oppretter en liste
        List<String> list = new ArrayList<>(); 

        // Legger til elementer
        list.add("Geeks"); 
        list.add("for"); 
        list.add("feil");
        list.add("Geeks"); 

        // Bruker en iterator for å iterere gjennom listen
        Iterator<String> iterator = list.iterator(); 

        while (iterator.hasNext()) { 
            String element = iterator.next(); 
            if(element == "feil"){
                iterator.remove();
            }
        } 
        System.out.println(list);
    }   
}

class IterateUsingforEach { 
    public static void main(String[] args) { 
        
        // Oppretter en liste
        List<String> list = new ArrayList<>(); 

        // Legger til elementer i listen
        list.add("Geeks"); 
        list.add("for"); 
        list.add("Geeks"); 

        // Itererer gjennom listen med forEach-metode og lambda-uttrykk
        list.forEach( 
            (element) -> { System.out.println(element); }); 
    } 
}
