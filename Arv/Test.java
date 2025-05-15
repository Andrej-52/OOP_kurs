package Arv;

// Java-program for å illustrere
// konseptet arv

// Superklasse (base class)
class Bicycle {
    // Bicycle-klassen har to felt
    public int gear;
    public int speed;

    // Bicycle-klassen har én konstruktør
    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    // Bicycle-klassen har én metode for å bremse
    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    // toString()-metode for å skrive ut info om Bicycle
    public String toString() {
        return ("Antall gir er " + gear + "\n"
                + "Hastigheten på sykkelen er " + speed);
    }
}

// Subklasse (avledet klasse)
class MountainBike extends Bicycle {

    // MountainBike-klassen legger til ett ekstra felt
    public int seatHeight;

    // Konstruktør for MountainBike-klassen
    public MountainBike(int gear, int speed, int startHeight) {
        // Kaller superklassens (Bicycle) konstruktør
        super(gear, speed);
        seatHeight = startHeight;
    }

    // MountainBike legger til en metode for å endre setehøyde
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    // Overstyrer toString()-metoden fra Bicycle
    @Override
    public String toString() {
        return (super.toString() + "\nSetehøyde er " + seatHeight);
    }
}

// Klasse for å teste
public class Test {
    public static void main(String[] args) {

        // Lager et MountainBike-objekt
        MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println("Direkte referanse til MountainBike:");
        System.out.println(mb.toString());

        // 📌 Eksempel på polymorfisme:
        // En Bicycle-referanse peker til et MountainBike-objekt
        Bicycle bike = new MountainBike(5, 80, 30);
        System.out.println("\nPolymorfisme med Bicycle-referanse:");
        System.out.println(bike.toString()); // Kaller MountainBike sin toString()

    }
}
