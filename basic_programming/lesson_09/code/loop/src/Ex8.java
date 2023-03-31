import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        // задание
        // считать три числа a, b, c
        // вывести все четные числа между [a,b] и нечетные [b, c]
        // гарантируется a < b < c
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int currentNumber = a;

        // проверяем, если число - нечетное, делаем из него четное
        if (currentNumber % 2 == 1) {
            currentNumber = currentNumber + 1;
        }

        while (currentNumber <= b) {
            System.out.print(currentNumber + " ");
            currentNumber = currentNumber + 2;
        }
        System.out.println();
        System.out.println("-----");

        currentNumber = b;
        // проверяем, если число - четное, делаем из него нечетное
        if (currentNumber % 2 == 0) {
            currentNumber = currentNumber + 1;
        }

        while (currentNumber <= c) {
            System.out.print(currentNumber + " ");
            currentNumber = currentNumber + 2;
        }


    }
}
