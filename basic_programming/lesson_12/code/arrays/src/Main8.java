import java.util.Random;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        // сортировка массива методом выбора - SelectionSort

        // сгенерируем случайный массив длины n
        Scanner scanner = new Scanner(System.in);
        // считаем число n
        int n = scanner.nextInt();
        // создаем массив длины n
        int[] a = new int[n];

        Random random = new Random();
        // каждый элемент массива забить случайным числом от 0 до 99

        /*
            int i = 0;
            while (i < a.length) {
                a[i] = random.nextInt(100);
                i++;
            }

         */

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }



        // распечатаем массив
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
