import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[10];
        int count = 0;

        while (true) {
            System.out.println("1. Добавить слово");
            System.out.println("2. Удалить слово");

            int command = scanner.nextInt();
            // считать пустую строку, потому что nextInt() - оставляет курсор (считыватель) на той же строке, что и число
            scanner.nextLine();

            switch (command) {
                case 1:
                    // добавление
                    String line = scanner.nextLine();
                    array[count] = line;
                    count++;

                    // расширение
                    // если массив заполнен - создаем новый большей длины, в него копируем все элементы и пользуемся им
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
                    // считали слово
                    String word = scanner.nextLine();
                    // нужно найти это слово в массиве
                    for (int i = 0; i < count; i++) {
                        if (array[i].equals(word)) {
                            // вам нужно удалить i-ое слово
                            for (int j = i; j < count - 1; j++) {
                                array[j] = array[j + 1];
                            }
                            // уменьшаем количество элементов, которое мы добавили
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