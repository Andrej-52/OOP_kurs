package Grensesnitt;

// Add-grensesnitt (interface)
interface Add {
    int add(int a, int b);
}

// Sub-grensesnitt
interface Sub {
    final int subtractor = 10;

    int sub(int a, int b);
}

// Div-grensesnitt
public interface Div {
    default double div(double a, double b){
        return a / b;
    }
}

// Kalkulator-klasse som implementerer
// både Add, Sub og Div
class Cal implements Add, Sub, Div {

    // Metode for å legge sammen to tall
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    // Metode for å trekke to tall fra hverandre
    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    // Ekstra metode for å multiplisere to tall
    public double multiply(double a, double b) {
        return a * b;
    }

    // Hovedmetode (main)
    public static void main(String[] args) {
        // Lager en instans av Cal-klassen
        Cal x = new Cal();

        System.out.println("Addisjon: " + x.add(2, 1));
        System.out.println("Subtraksjon: " + x.sub(subtractor, 1));
        System.out.println("Multiplikasjon: " + x.multiply(2, 3));
        System.out.println("Divisjon: " + x.div(4, 2));

    }
}

