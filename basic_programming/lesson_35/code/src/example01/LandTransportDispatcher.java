package example01;

/**
 * 6/16/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class LandTransportDispatcher {

    private AbstractLandTransport[] transports;

    public LandTransportDispatcher(AbstractLandTransport[] transports) {
        this.transports = transports;
    }

    public void sayAllGo() {
        for (int i = 0; i < transports.length; i++) {
            transports[i].go();
        }
    }

    public void sayAllStop() {
        for (int i = 0; i < transports.length; i++) {
            transports[i].stop();
        }
    }
}
