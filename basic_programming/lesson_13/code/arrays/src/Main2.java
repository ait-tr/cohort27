import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        Random random = new Random();

        // создаем массив длины 1 000 000 000 со случайными значениями
        // представим, что этот массив - набор статей
        int[] array = new int[100_000];

        for (int i = 0; i < array.length; i++) {
            // генерирую случайное число в диапазоне 0 до 999 999
            array[i] = random.nextInt(1_000_000);
        }

        System.out.println("Массив инициализирован");

        // сгенерируем массив данных для поиска
        // представим, что это набор заголовков статей
        int[] numbersForSearch = new int[100_000];

        for (int i = 0; i < numbersForSearch.length; i++) {
            // генерирую случайное число в диапазоне от 0 до 1 999 999
            numbersForSearch[i] = random.nextInt(2_000_000);
        }

        System.out.println("Запущен поиск...");

        // нам надо найти все газеты, которые имеют нужные заголовки
        // запоминаем время до
        long before = System.currentTimeMillis();
        int count = 0;
        // пробегаем по всем элементам массива numbersForSearch
        for (int j = 0; j < numbersForSearch.length; j++) {
            // для каждого numbersForSearch[j] - он выполняет поиск
            int currentNumber = numbersForSearch[j];

            for (int i = 0; i < array.length; i++) {
                // проверяем два элемента на каждом шаге циклов
                if (currentNumber == array[i]) {
                    count++;
                    break;
                }
            }
        }

        // запоминаем время после
        long after = System.currentTimeMillis();
        System.out.println("Поиск занял - " + ((after - before) / 1000.0));
        System.out.println("Всего совпадений: " + count);
    }
}
