import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        // каждый элемент считываю с консоли
        for (int i = 0; i < 5; i++) {
            a[i] = scanner.nextInt();
        }

        // выводим переменные (элементы массива) в консоль
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
