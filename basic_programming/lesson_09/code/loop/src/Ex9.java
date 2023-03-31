import java.util.Scanner;

public class Ex9 {

    // Ex9
    // считываете два числа a, b
    // печатаете [a,b] если a < b, [b, a] если a > b
    // 10 15 -> 10 11 12 13 14 15
    // 15 10 -> 15 14 13 12 11 10
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int currentNumber = a;

        while (currentNumber < b) {
            System.out.print(currentNumber + " ");
            currentNumber = currentNumber + 1;
        }

        while (currentNumber >= b) {
            System.out.print(currentNumber + " ");
            currentNumber = currentNumber - 1;
        }
    }
}
