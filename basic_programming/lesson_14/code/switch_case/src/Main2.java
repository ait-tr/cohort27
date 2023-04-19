package switch_case;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("Один");
                break;
            case 2:
                System.out.println("Два");
                break;
            case 3:
                System.out.println("Три");
                break;
            default:
                System.out.println("Я устал");
        }
    }
}
