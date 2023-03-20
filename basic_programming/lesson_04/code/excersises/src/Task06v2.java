import java.util.Scanner;

public class Task06v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int digit5 = number % 10;
        number = number / 10;

        int digit4 = number % 10;
        number = number / 10;

        int digit3 = number % 10;
        number = number / 10;

        int digit2 = number % 10;
        number = number / 10;

        int digit1 = number % 10;
        number = number / 10;

        int digitsSum = digit1 + digit2 + digit3 + digit4 + digit5;
        System.out.println("Сумма цифр: " + digitsSum);
    }
}
