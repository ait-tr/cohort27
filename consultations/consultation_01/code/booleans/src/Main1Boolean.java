package booleans;

import java.util.Scanner;

public class Main1Boolean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        // 7 % 2 = 1, 7 = 2 * 3 + 1
        // 6 % 2 = 0, 6 = 2 * 3 + 0

        // number % 2 -> {0, 1}
        // number % 2 == 0 -> {true, false}
        // isEven -> {true, false}
        boolean isEven = number % 2 == 0;

        // true == true -> true
        // false == true -> false

        // if (true) - идем по первой ветке
        // if (false) - идем по второй ветке
        if (isEven == true) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
    }
}
