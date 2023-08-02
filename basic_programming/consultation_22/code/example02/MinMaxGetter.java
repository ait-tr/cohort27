package example02;

import java.util.Comparator;

/**
 * 8/1/2023
 * Comparator_Comparable
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class MinMaxGetter {

    // вы разрешаете только такие T, которые имплементируют Comparable
    public static <T extends Comparable<T>> T minElement(T[] array) {
        T min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(min) < 0) { // a.compareTo(b) вам вернулось число отрицательное, значит a меньше чем b; array
                min = array[i];
            }
        }

        return min;
    }

    public static <T> T minElement(T[] array, Comparator<T> comparator) {
        T min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (comparator.compare(array[i], min) < 0) { // a.compareTo(b) вам вернулось число отрицательное, значит a меньше чем b; array
                min = array[i];
            }
        }

        return min;
    }
}
