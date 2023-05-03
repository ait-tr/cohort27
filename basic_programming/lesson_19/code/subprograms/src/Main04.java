import java.util.Scanner;

// Предоставить пользователю меню
// 1. Добавить слово
// 2. Найти слово
// 3. Удалить слово
// 4. Распечатать все слова
// 5. Выход
public class Main04 {

    public static void showMenu() {
        System.out.println("1. Добавить слово");
        System.out.println("2. Найти слово");
        System.out.println("3. Удалить слово");
        System.out.println("4. Распечатать все слова");
        System.out.println("5. Выход");
    }

    /* функция, которая добавляет в массив array какое-либо слово word и возвращает
      количество слов, которое содержится в массиве после добавления
      addWord(words, "Hello", 3)
      то в массив на позицию 3 добавится слово Hello и вернется 4
     */
    public static int addWord(String[] array, String word, int count) {
        // если массив переполнен
        if (array.length == count) {
            // говорим, что он переполнен
            System.err.println("Массив переполнен");
            // возвращаем неизменное количество
            return count;
        }
        /* добавляем слово в позицию, равной числу элементов
         если в массиве уже было 3 элемента
         значит count = 3
         array[3] = word
         */
        array[count] = word;
        count++;
        return count; // count = 4
    }

    public static void printWords(String[] array, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        String[] words = new String[10]; // пусть будет ограниченный массив для 10-слов
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        boolean isRun = true;

        while (isRun) { // пока true - программа работает

            showMenu(); // выводим меню

            int command = scanner.nextInt(); // считываем команду

            scanner.nextLine(); // пропускаем текущую строку после nextInt()
            switch (command) { // в зависимости от команды
                case 1:
                    String word = scanner.nextLine();
                    count = addWord(words, word, count);
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

