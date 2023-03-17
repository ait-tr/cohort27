import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        // сумма цифр трехзначного числа
        Scanner scanner = new Scanner(System.in);
        // считали число
        int number = scanner.nextInt();
        // любое трехзначное число можно представить в виде
        // abc = a * 100 + b * 10 + c * 1
        // 125 = 1 * 100 + 2 * 10 + 5 * 1

        // как получить самую последнюю цифру?
        // например для 125:

        // 125 = 12 * 10 + 5
        int digit3 = number % 10; // 5

        number = number / 10; // 12

        // 12 = 1 * 10 + 2
        int digit2 = number % 10; // 2

        number = number / 10; // 1

        // 1 = 10 * 0 + 1
        int digit1 = number % 10; // 1

        int digitsSum = digit1 + digit2 + digit3;

        System.out.println("Сумма цифр: " + digitsSum);
    }
}
