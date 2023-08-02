package example02;

import java.util.Comparator;

/**
 * 8/1/2023
 * Comparator_Comparable
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class CarsByPlacesComparator implements Comparator<Car> {

    @Override
    public int compare(Car a, Car b) {
        return a.getPlaces() - b.getPlaces();
    }
}
