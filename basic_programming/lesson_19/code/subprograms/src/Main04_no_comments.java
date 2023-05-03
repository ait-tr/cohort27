import java.util.Scanner;

public class Main04_no_comments {

    public static void showMenu() {
        System.out.println("1. Добавить слово");
        System.out.println("2. Найти слово");
        System.out.println("3. Удалить слово");
        System.out.println("4. Распечатать все слова");
        System.out.println("5. Выход");
    }

    public static int addWord(String[] array, String word, int count) {
        if (array.length == count) {
            System.err.println("Массив переполнен");
            return count;
        }
        array[count] = word;
        count++;
        return count;
    }

    public static void printWords(String[] array, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        String[] words = new String[10];
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        boolean isRun = true;

        while (isRun) {

            showMenu();

            int command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {
                case 1:
                    String word = scanner.nextLine();
                    // count 3
                    count = addWord(words, word, count);
                    // count 4
                    break;
                case 4:
                    printWords(words, count);
                    break;
                case 5:
                    isRun = false;
                    break;
            }
        }
    }
}

