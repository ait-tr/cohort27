package example02;

/**
 * 6/16/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Helicopter implements AirTransport {
    public void fly() {
        System.out.println("Вертолет полетел тушить пожар!");
    }

    public void land() {
        System.out.println("Такой пожар, как в группе 27 на теме вложенных классов не потушить.");
    }
}
