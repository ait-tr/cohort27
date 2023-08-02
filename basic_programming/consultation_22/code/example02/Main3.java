package example02;

/**
 * 8/1/2023
 * Comparator_Comparable
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main3 {
    public static void main(String[] args) {
        Car car1 = new Car(10);
        Car car2 = new Car(15);
        Car car3 = new Car(2);

        Car[] cars = {car1, car2, car3};

        CarsByPlacesComparator comparator = new CarsByPlacesComparator();

        Car minPlacesCar = MinMaxGetter.minElement(cars, comparator);

        System.out.println(minPlacesCar);
    }
}
