import java.util.Random;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        // создать массив случайного размера и случайных элементов
        // заполнение массива случайными числами
        Random random = new Random();
        int size = random.nextInt(100);

        int[] a = new int[size];
        size++;

        // в каждый элемент массива кладем случайное число
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt();
        }
        // выводим массив
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
