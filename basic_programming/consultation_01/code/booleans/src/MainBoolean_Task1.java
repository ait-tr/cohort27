package booleans;

import java.util.Scanner;

public class MainBoolean_Task1 {
    public static void main(String[] args) {
        // проверить выражение - число четное и больше 10

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number % 2 == 0) {

            if (number > 10) {
                System.out.println("Верно!"); // четное, больше 10
            } else {
                System.out.println("Четное, но меньше 10");
            }

        } else {
            System.out.println("Число точно четное, но больше 10 или меньше - сказать не можем!");
        }
    }
}
