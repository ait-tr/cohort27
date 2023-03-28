package booleans;

import java.util.Scanner;

public class MainBoolean_Task2 {
    public static void main(String[] args) {
        // проверить выражение - число четное или больше 10

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number % 2 == 0 && number > 10) {
                System.out.println("Верно!"); // четное, больше 10
        } else {
            System.out.println("Неверно");
        }
    }
}
