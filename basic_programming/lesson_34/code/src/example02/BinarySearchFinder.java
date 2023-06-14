package example02;


import java.util.Arrays;

/**
 * 6/14/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class BinarySearchFinder extends AbstractFinder {

    public BinarySearchFinder(int[] elements) {
        super(null);
        int[] newElements = Arrays.copyOf(elements, elements.length); // делаем копию
        this.elements = newElements; // кладем копию в качестве основного массива
        Arrays.sort(this.elements); // сортировка массива
    }

    @Override
    public boolean find(int element) {
        System.out.println("Ищем с помощью бинарного поиска...");
        int left = 0;
        int right = elements.length - 1;
        int middle = left + (right - left) / 2;

        while (left <= right) { // бинарный поиск
            if (element < elements[middle]) {
                right = middle - 1;
            } else if (element > elements[middle]) {
                left = middle + 1;
            } else {
                return true;
            }

            middle = left + (right - left) / 2;
        }

        return false;
    }

}
