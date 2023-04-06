import java.util.Random;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        // заполнение массива случайными числами
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] a = new int[size];

        // в каждый элемент массива кладем случайное число
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        // выводим массив
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
