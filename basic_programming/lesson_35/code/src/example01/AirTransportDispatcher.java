package example01;

/**
 * 6/16/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class AirTransportDispatcher {

    private AbstractAirTransport[] transports;

    public AirTransportDispatcher(AbstractAirTransport[] transports) {
        this.transports = transports;
    }

    public void sayAllFly() {
        for (int i = 0; i < transports.length; i++) {
            transports[i].fly();
        }
    }

    public void sayAllLand() {
        for (int i = 0; i < transports.length; i++) {
            transports[i].land();
        }
    }
}
