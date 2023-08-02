package example01;

/**
 * 8/1/2023
 * Comparator_Comparable
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {
    public static void main(String[] args) {
        int[] a = {45, 10, -4, 29, 100, -10, 11, 16, -2, 1000, -15};
        int minNumber = MinMaxGetter.min(a);

        System.out.println(minNumber);
    }
}
