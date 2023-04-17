import java.util.Arrays;
import java.util.Random;

public class Main10 {
    public static void main(String[] args) {
        Random random = new Random();

        long before, after;

        int[] array = new int[100_000];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1_000_000);
        }

        System.out.println("Массив <array> инициализирован");

        int[] numbersForSearch = new int[100_000];

        for (int i = 0; i < numbersForSearch.length; i++) {
            numbersForSearch[i] = random.nextInt(2_000_000);
        }

        System.out.println("Массив <numbersForSearch> инициализирован");

        System.out.println("Запущена сортировка: ");

        before = System.currentTimeMillis();

        Arrays.sort(array);

        after = System.currentTimeMillis();

        System.out.println("Сортировка заняла - " + ((after - before) / 1000.0));

        System.out.println("Запущен поиск...");

        before = System.currentTimeMillis();

        int count = 0;

        for (int j = 0; j < numbersForSearch.length; j++) {
            int currentNumber = numbersForSearch[j];

            int left = 0;
            int right = array.length - 1;

            int middle = left + (right - left) / 2;

            while (left <= right) {
                if (currentNumber < array[middle]) {
                    right = middle - 1;
                } else if (currentNumber > array[middle]) {
                    left = middle + 1;
                } else {
                    count++;
                    break;
                }

                middle = left + (right - left) / 2;
            }
        }
        System.out.println("Поиск завершен");

        after = System.currentTimeMillis();
        System.out.println("Поиск занял - " + ((after - before) / 1000.0));
        System.out.println("Всего совпадений: " + count);
    }
}
