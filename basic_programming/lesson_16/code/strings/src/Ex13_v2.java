import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ex13_v2 {
    // Цель - научиться работать с массивом и массивом строк
    // добавление, удаление, поиск
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // массив длины 10
        String[] array = new String[10];
        // количество элементов
        int count = 0;

        while (true) {
            // выводим меню
            System.out.println("1. Добавить слово");
            System.out.println("2. Удалить слово");
            System.out.println("3. Вывести слово под индексом");
            System.out.println("4. Удалить только первое вхождение слова");

            // считываем команду
            int command = scanner.nextInt();
            // считываем пустую строку
            scanner.nextLine();

            // ***************************************************************

            // распознаем команду и реагируем на нее
            if (command == 1) {

                System.out.println("Будем добавлять слово!");
                // считали строку
                String line = scanner.nextLine();
                // положили строку под индексом count
                array[count] = line;
                // увеличили count на 1
                count++;

            } else if (command == 2) {
                System.out.println("Будем удалять слово (все вхождения)");
                // считываем строку, которую нужно найти в массиве и удалить
                String line = scanner.nextLine();
                // нужно пробежать все элементы массива, чтобы найти это слово и удалить
                for (int i = 0; i < count; i++) {
                    // сравниваем текущее слово, с тем, которое нам подали на вход (которое нужно удалить)
                    if (array[i].equals(line)) {
                        // начиная с элемента, который нужно удалить, необходимо сделать сдвиг всех элементов влево
                        for (int j = i; j < count - 1; j++) {
                            array[j] = array[j + 1];
                        }
                        count--;
                    }
                }
            } else if (command == 3) {
                // считываем индекс
                int index = scanner.nextInt();
                // считываем пустую строку
                scanner.nextLine();
                // индекс в нужном диапазоне
                if (index >= 0 && index < count) {
                    System.out.println(array[index]);
                } else {
                    System.out.println("Нет такого элемента :(");
                }
            } else if (command == 4) {
                System.out.println("Будем удалять слово (первое вхождения)");
                // считываем строку, которую нужно найти в массиве и удалить
                String line = scanner.nextLine();
                // нужно пробежать все элементы массива, чтобы найти это слово и удалить
                for (int i = 0; i < count; i++) {
                    // сравниваем текущее слово, с тем, которое нам подали на вход (которое нужно удалить)
                    if (array[i].equals(line)) {
                        // начиная с элемента, который нужно удалить, необходимо сделать сдвиг всех элементов влево
                        for (int j = i; j < count - 1; j++) {
                            array[j] = array[j + 1];
                        }
                        count--;
                        // останавливаем цикл, чтобы он больше не искал слова
                        break;
                    }
                }
            } else {
                System.out.println("Команда не распознана");
            }

            System.out.print("Список элементов: ");
            for (int i = 0; i < count; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
            System.out.println("Фактический массив: " + Arrays.toString(array));
        }

    }
}
