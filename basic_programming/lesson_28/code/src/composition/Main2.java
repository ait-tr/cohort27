package composition;

public class Main2 {
    public static void main(String[] args) {
        Driver marsel = new Driver("Марсель", 29);
        Driver petr = new Driver("Петр", 14);

        Bus bus1 = new Bus("X35");
        Bus bus2 = new Bus("Y22");

        marsel.setBus(bus1);
        petr.setBus(bus2);

        Passenger andreas = new Passenger("Andreas", false);
        Passenger egor = new Passenger("Egor", false);
        Passenger kenan = new Passenger("Kenan", true);
        Passenger viktoriya = new Passenger("Viktoriya", true);
        Passenger wados = new Passenger("Wados", true);
        Passenger andrey = new Passenger("Андрей", false);

        bus1.addPassenger(viktoriya);
        bus1.addPassenger(kenan);
        bus1.addPassenger(wados);

        bus2.addPassenger(andreas);
        bus2.addPassenger(egor);
        bus2.addPassenger(andrey);

        marsel.drive();
        petr.drive();

        marsel.tellAbout();
        petr.tellAbout();
    }
}
