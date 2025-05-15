public class Car {

    // Privat felt: kun tilgjengelig inne i klassen
    private String brand;

    // Final felt: kan kun settes én gang, kan ikke endres senere
    private final String origin;

    // Beskyttet felt: tilgjengelig i samme pakke eller i subklasser
    protected int productionYear;

    // Statisk felt: delt mellom alle Car-objekter
    private static int totalCars = 0;

    // Konstruktør: setter verdiene når objektet lages
    public Car(String brand, String origin, int year) {
        this.brand = brand;
        this.origin = origin;
        this.productionYear = year;
        totalCars++; // Øker antall biler hver gang en ny Car lages
    }

    // Offentlig metode: gir tilgang til brand-feltet
    public String getBrand() {
        return brand;
    }

    // Offentlig metode: simulerer at bilen starter
    public void start() {
        System.out.println(brand + " is starting.");
    }

    // Beskyttet metode: skriver ut produksjonsåret
    protected void printProductionYear() {
        System.out.println("Production Year: " + productionYear);
    }

    // Statisk metode: returnerer hvor mange Car-objekter som er opprettet
    public static int getTotalCars() {
        return totalCars;
    }

    // Hovedmetoden (main): startpunktet for programmet
    public static void main(String[] args) {
        // Lager et nytt Car-objekt
        Car car = new Car("Toyota", "Japan", 2020);

        // Kaller på metodene
        car.start(); // Starter bilen
        System.out.println("Brand: " + car.getBrand()); // Skriver ut merke
        System.out.println("Total Cars: " + Car.getTotalCars()); // Skriver ut totalt antall biler
        car.printProductionYear(); // Skriver ut produksjonsår
    }
}
