import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        // Считать массив с консоли
        // вывести его в обратном порядке
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] a = new int[size];

        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        // вывести в прямом порядке
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        // выводим элементы массива в обратном порядке
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}
