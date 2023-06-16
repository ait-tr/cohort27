package example01;

/**
 * 6/16/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Bus extends AbstractLandTransport {
    public void go() {
        System.out.println("Автобус поехал за пассажирами");
    }

    public void stop() {
        System.out.println("Автобус остановился");
    }
}
