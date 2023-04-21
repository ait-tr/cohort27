import java.util.Arrays;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[10];
        int count = 0;

        while (true) {
            System.out.println("1. Добавить слово");
            System.out.println("2. Удалить слово");
            // TODO: System.out.println("3. Вывести слово под индексом")
            // TODO: System.out.println("4. Удалить только первое вхождение слова")

            int command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {
                case 1:
                    String line = scanner.nextLine();
                    array[count] = line;
                    count++;

                    if (count == array.length) {
                        int newLength = array.length + array.length / 2;
                        String[] newArray = new String[newLength];
                        for (int i = 0; i < array.length; i++) {
                            newArray[i] = array[i];
                        }
                        array = newArray;
                        System.out.println("Массив увеличен");
                    }
                    break;
                case 2:
                    String word = scanner.nextLine();
                    for (int i = 0; i < count; i++) {
                        if (array[i].equals(word)) {
                            for (int j = i; j < count - 1; j++) {
                                array[j] = array[j + 1];
                            }
                            count--;
                        }
                    }
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
