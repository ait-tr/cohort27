package example01;

public class Main02 {
    public static void main(String[] args) {
        Driver marsel = new Driver("Марсель", 5); // создали водителя
        Driver petr = new Driver("Петр", 14);
        marsel.tellAbout(); // попросили рассказать о себе
        marsel.setExperience(10); // задали ему новый опыт

        Bus bus1 = new Bus("X35"); // создали автобусы
        Bus bus2 = new Bus("Y10");

        marsel.setBus(bus1); // водитель управляет автобусом X35

        marsel.drive();
        petr.drive();

        Passenger andreas = new Passenger("Andreas", false);
        Passenger egor = new Passenger("Egor", false);
        Passenger kenan = new Passenger("Kenan", true);
        Passenger viktoriya = new Passenger("Viktoriya", true);


        marsel.tellAbout(); // водитель рассказывает о себе
        marsel.setBus(bus2); // водитель управляет автобусом Y100
        bus2.setDriver(marsel);
        marsel.tellAbout(); // водитель рассказывает о себе

    }
}
