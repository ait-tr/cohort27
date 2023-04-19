package homeworks;

import java.util.Random;

public class Task15 {
    public static void main(String[] args) {
        // Сгенерировать случайный массив размерности 10.
        Random random = new Random();

        int[] a = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }

        // Вывести данный массив в консоль.
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        // выводим пустую строку
        System.out.println();

        int localMinsCount = 0;

        // учесть первый и последний элемент

        for (int i = 1; i < a.length - 1; i++) {
            // проверяем левого и правого соседа
            if (a[i] < a[i - 1] && a[i] < a[i + 1]) {
                // увеличиваем количество локальных минимумов
                localMinsCount++;
            }
        }

        System.out.println(localMinsCount);
    }
}
