import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        // пользователь вводит размер будущего массива
        size = scanner.nextInt();
        // создаем массив размера, введенного пользователем
        int[] a = new int[size]; // 5

        size++; // 6
        // каждый элемент считываю с консоли
        for (int i = 0; i < size; i++) {
            a[5] = scanner.nextInt();
        }

        // выводим переменные (элементы массива) в консоль
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
