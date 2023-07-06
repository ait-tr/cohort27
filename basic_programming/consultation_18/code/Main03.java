import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 7/6/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main03 {
    public static int div(int x, int y) {
        return x / y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = div(a, b);
                System.out.println(c);
            } catch (ArithmeticException e) {
                System.out.println("У вас ошибка - " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Ошибка формата ввода. Пожалуйста, введите число");
                scanner.nextLine();
            }
        }
    }
}
