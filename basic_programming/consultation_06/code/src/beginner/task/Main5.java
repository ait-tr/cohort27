package beginner.task;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {-10, 7, -3, 2, 6, 11, -3, 8, -3};

        // с консоли подается число, нужно найти
        // его в массиве и вывести его индекс
        // если число встречается несколько раз, вывести только первый индекс
        // -3 -> 2

        int number = scanner.nextInt();

        // i = 0, 1, 2, 3, 4, 5, 6, 7, 8
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.println(i);
            }
        }
    }
}
