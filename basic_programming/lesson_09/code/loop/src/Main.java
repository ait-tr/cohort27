import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 10 15
        // 10 11 12 13 14 15
        int from = scanner.nextInt();
        int to = scanner.nextInt();

        int currentNumber = from;

        // шаг 1 : проверяем условие
        while (currentNumber <= to) {
            // если условие - истина
            // шаг 2: печатаем currentNumber
            System.out.println(currentNumber);
            // шаг 3: увеличиваем currentNumber на единицу
            currentNumber = currentNumber + 1;
            // шаг 4 -> переходим к шагу 1
        }

    }
}