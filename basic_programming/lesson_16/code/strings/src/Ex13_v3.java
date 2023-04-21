import java.util.Arrays;
import java.util.Scanner;

public class Ex13_v3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[10];
        int count = 0;

        boolean isRun = true;

        while (isRun) {
            System.out.println("1. Добавить слово");
            System.out.println("2. Удалить слово");
            System.out.println("3. Вывести слово под индексом");
            System.out.println("4. Удалить только первое вхождение слова");
            System.out.println("5. Выход");

            int command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {
                case 1: // if command == 1
                    System.out.println("Будем добавлять слово!");
                    String line = scanner.nextLine();
                    array[count] = line;
                    count++;

                    break;
                case 2: // else if command == 2
                    System.out.println("Будем удалять слово (все вхождения)");
                    line = scanner.nextLine();
                    for (int i = 0; i < count; i++) {
                        if (array[i].equals(line)) {
                            for (int j = i; j < count - 1; j++) {
                                array[j] = array[j + 1];
                            }
                            count--;
                        }
                    }

                    break;
                case 3: // else if command == 3
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    if (index >= 0 && index < count) {
                        System.out.println(array[index]);
                    } else {
                        System.out.println("Нет такого элемента :(");
                    }

                    break;
                case 4: // else if command == 4
                    System.out.println("Будем удалять слово (первое вхождения)");
                    line = scanner.nextLine();
                    for (int i = 0; i < count; i++) {
                        if (array[i].equals(line)) {
                            for (int j = i; j < count - 1; j++) {
                                array[j] = array[j + 1];
                            }
                            count--;
                            break;
                        }
                    }

                    break;
                case 5:
                    isRun = false;

                    break;
                default:
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
