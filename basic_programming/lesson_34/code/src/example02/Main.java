package example02;

import java.util.Arrays;

/**
 * 6/14/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {4, 5, 6, 10, -7, 8};
//        AbstractFinder finder;
//        BinarySearchFinder binarySearchFinder = new BinarySearchFinder(array);
//        finder = binarySearchFinder; // восходящее преобразование

        AbstractFinder finder = new SimpleFinder(array);

        finder.findNumberAndPrint();
    }
}
