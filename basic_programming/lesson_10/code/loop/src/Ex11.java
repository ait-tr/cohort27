import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        // Вводится 999 чисел
        // каждое число - уникальное
        // диапазон чисел 1 - 1000
        // кроме одного - одно не встречается
        // нужно выяснить какое число не встречается в этой последовательности
        // вводятся в случайном порядке

        Scanner scanner = new Scanner(System.in);

        int i = 0;

        // считаем сумму всех чисел от 1 до 1000
        int n = 1;
        int sum = 0;
        while (n <= 1000) {
            sum = sum + n;
            n++;
        }

        // параллельно с вводом чисел считаем их сумму
        int sum2 = 0;

        while (i <= 999) {
            int currentNumber = scanner.nextInt();
            sum2 = sum2 + currentNumber;
            i++;
        }
        // выводим разницу между суммами, это и будет пропущенное число
        System.out.println(sum - sum2);

        // 1 2 3 4 5 6 7 8 9 10
        // 4 2 1 6 3 9 8 7 10 x
    }
}
