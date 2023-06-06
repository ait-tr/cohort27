package task17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dictionary = new String[10]; // массив слов
        String word = "";
        int wordsCount = 0; // количество слов в массиве
        boolean isRun = true;
        while (isRun) {
            System.out.println("1. Добавить слово"); // РЕШЕНО
            System.out.println("2. Найти слово"); // TODO: решить, см. Task20
            System.out.println("3. Поиск по префиксу"); // РЕШЕНО
            System.out.println("4. Поиск по суффиксу");
            System.out.println("5. Удалить слово");
            System.out.println("6. Показать словарь"); // РЕШЕНО
            System.out.println("0. Выход"); // РЕШЕНО

            int command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {
                case 1:
                    word = scanner.nextLine();
                    dictionary[wordsCount] = word;
                    wordsCount++;
                    break;
                case 3:
                    // Marsel Cat Marat Bye Marusya -> Mar -> Marsel, Marat, Marusa
                    String prefix = scanner.nextLine();
                    for (int i = 0; i < wordsCount; i++) {
                        if (dictionary[i].startsWith(prefix)) {
                            System.out.print(dictionary[i] + " ");
                        }
                    }
                    break;
                case 6:
                    for (int i = 0; i < wordsCount; i++) {
                        System.out.print(dictionary[i] + " ");
                    }
                    System.out.println();
                    break;
                case 0:
                    isRun = false;
                    break;
                default:
                    System.out.println("Команда не распознана");
            }

        }


    }
}
