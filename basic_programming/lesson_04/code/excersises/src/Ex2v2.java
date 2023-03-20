import java.util.Scanner;

public class Ex2v2 {
    // считать переменные a и b из консоли
    // поменять их значения местами и вывесь в консоль

    // если a = 10, b = 15, то a = 15, b = 10
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); // 10
        int b = scanner.nextInt(); // 15

        a = a + b; // 10 + 15 = 25
        b = a - b; // 25 - 15 = 10
        a = a - b; // 25 - 10 = 15

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
