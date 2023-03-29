import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // вывести значение выражения:
        // число number - четное или оканчивается на 3

        // проверка четности числа number
        boolean A = number % 2 == 0; // левый операнд

        // проверка, оканчивается ли число на 3
        boolean B = number % 10 == 3; // правый операнд

        System.out.println(A | B);
    }
}