import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // если у меня два числа в сумме дают четное число или в сумме оканчиваются на 3
        // вывести их произведение
        // иначе если два числа в разности дают один - вывести их сумму
        // в противном случае - вывести их частное

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // (a + b) % 2 == 0 - два числа в сумме дают четное число
        // (a + b) % 10 == 3 - два числа в сумме оканчиваются на 3

        if (((a + b) % 2 == 0) || ((a + b) % 10 == 3)) {
            System.out.println(a * b);
        } else if (a - b == 1) {
            System.out.println(a + b);
        } else {
            System.out.println(a / b);
        }
    }
}
