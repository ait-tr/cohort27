package example02;

/**
 * 8/1/2023
 * Comparator_Comparable
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Car {
    private int places;

    public Car(int places) {
        this.places = places;
    }

    public int getPlaces() {
        return places;
    }

    @Override
    public String toString() {
        return "Car{" +
                "places=" + places +
                '}';
    }
}
