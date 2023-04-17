import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        int[] array = {-5, 1, 8, 30, 41, 45, 52, 53, 54, 58, 68, 73, 80, 86, 88};

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int left = 0;
        int right = array.length - 1;

        int middle = left + (right - left) / 2;
        // бинарный поиск - позволяет значительно сократить время поиска
        // например вместо проверки 100 элементов, нужно проверить только 10
        while (left <= right) {
            if (number < array[middle]) {
                right = middle - 1;
            } else if (number > array[middle]) {
                left = middle + 1;
            } else {
                System.out.println("Число найдено!");
                break;
            }

            middle = left + (right - left) / 2;

        }
    }
}
