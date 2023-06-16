package example02;

/**
 * 6/16/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Car implements LandTransport {
    public void go() {
        System.out.println("Машина поехала на заправку");
    }

    public void stop() {
        System.out.println("Автомобиль остановился");
    }
}
