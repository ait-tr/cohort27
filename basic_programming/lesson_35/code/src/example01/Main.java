package example01;

/**
 * 6/16/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {
    public static void main(String[] args) {
        Aeroplane aeroplane = new Aeroplane();
        Bus bus = new Bus();
        Car car = new Car();
        Motorbike motorbike = new Motorbike();

        Helicopter helicopter = new Helicopter();

        AbstractLandTransport[] landTransports = {aeroplane, bus, car, motorbike};
        AbstractAirTransport[] airTransports = {helicopter};

        LandTransportDispatcher landTransportDispatcher = new LandTransportDispatcher(landTransports);
        AirTransportDispatcher airTransportDispatcher = new AirTransportDispatcher(airTransports);

        landTransportDispatcher.sayAllGo();
        landTransportDispatcher.sayAllStop();

        airTransportDispatcher.sayAllFly();
        airTransportDispatcher.sayAllLand();
    }
}
