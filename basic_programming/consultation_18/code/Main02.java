import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 7/6/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main02 {
    public static int div(int x, int y) {
        return x / y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int a = 0, b = 0;

            try {
                a = scanner.nextInt(); // 10
                b = scanner.nextInt(); // Hello - происходит ошибка
            } catch (InputMismatchException e) {
                System.out.println("Ошибка формата ввода. Пожалуйста, введите число");
                scanner.nextLine();
            }

            try {
                int c = div(a, b);
                System.out.println(c);
            } catch (ArithmeticException e) {
                System.out.println("У вас ошибка - " + e.getMessage());
            }
        }
    }
}
