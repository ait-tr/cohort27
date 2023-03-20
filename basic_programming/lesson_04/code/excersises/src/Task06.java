import java.util.Random;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // int digit = number % 10 - эта операция всегда забирает последнюю цифру,
        // потому что это остаток от деления на 10, 432 / 10 = 43, в остатке - 2, 432 = 43 * 10 + 2
        int digit5 = number % 10;
        // number = number / 10 - отсекаете у исходного числа последнюю цифру
        // и сохраняете в ту же переменную, таким образом заменяя исходное значение
        number = number / 10;

        System.out.println("digit5 = " + digit5);
        System.out.println("number = " + number);
        System.out.println("-------------------------------------");

        int digit4 = number % 10;
        number = number / 10;

        System.out.println("digit4 = " + digit4);
        System.out.println("number = " + number);
        System.out.println("-------------------------------------");

        int digit3 = number % 10;
        number = number / 10;

        System.out.println("digit3 = " + digit3);
        System.out.println("number = " + number);
        System.out.println("-------------------------------------");

        int digit2 = number % 10;
        number = number / 10;

        System.out.println("digit2 = " + digit2);
        System.out.println("number = " + number);
        System.out.println("-------------------------------------");

        int digit1 = number % 10;
        number = number / 10;

        System.out.println("digit1 = " + digit1);
        System.out.println("number = " + number);
        System.out.println("-------------------------------------");

        int digitsSum = digit1 + digit2 + digit3 + digit4 + digit5;
        System.out.println("Сумма цифр: " + digitsSum);
    }
}
