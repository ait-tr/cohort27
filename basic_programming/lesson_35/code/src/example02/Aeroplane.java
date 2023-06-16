package example02;

/**
 * 6/16/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Aeroplane implements LandTransport, AirTransport {

    public void go() {
        System.out.println("Самолет поехал на взлетную полосу");
    }

    public void stop() {
        System.out.println("Самолет остановился");
    }

    public void fly() {
        System.out.println("Самолет взлетает!");
    }

    public void land() {
        System.out.println("Самолет идет на посадку!");
    }
}
