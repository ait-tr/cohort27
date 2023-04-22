package beginner;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // на вход подается пять чисел, найти наибольшее из них
        Scanner scanner = new Scanner(System.in);

        int a1, a2, a3, a4, a5;

        a1 = scanner.nextInt();
        a2 = scanner.nextInt();
        a3 = scanner.nextInt();
        a4 = scanner.nextInt();
        a5 = scanner.nextInt();

        int max; // переменная, которая хранит максимальное значение

        if (a1 > a2) {
            max = a1;
        } else {
            max = a2;
        }

        if (a3 > max) {
            max = a3;
        }

        if (a4 > max) {
            max = a4;
        }

        if (a5 > max) {
            max = a5;
        }

        System.out.println(max);



    }
}
