package switch_case;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("Один");
        } else if (number == 2) {
            System.out.println("Два");
        } else if (number == 3) {
            System.out.println("Три");
        } else {
            System.out.println("Я устал");
        }
    }
}
