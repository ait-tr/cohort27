import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // сумма цифр числа
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        int lastDigit;

        while (number > 0)
        {
            // забираем последнюю цифру
            lastDigit = number % 10;
            // кидаем в сумму последнюю цифру
            sum = sum + lastDigit;
            number = number / 10;
        }

        System.out.println(sum);
    }
}
