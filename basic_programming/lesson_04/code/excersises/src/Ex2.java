import java.util.Scanner;

public class Ex2 {
    // считать переменные a и b из консоли
    // поменять их значения местами и вывесь в консоль

    // если a = 10, b = 15, то a = 15, b = 10
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // заводим третью переменную и туда кладем значение, которое лежало в <a>
        int temp = a;
        // в <a> кладем значение, которое лежало в <b>
        a = b;
        // теперь в <b> кладем значение, которое лежало в <a> до всего этого
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
