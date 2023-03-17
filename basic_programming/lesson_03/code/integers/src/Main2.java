import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // 8 = 2 * 4 + 0
        // 10 = 2 * 5 + 0
        // 11 = 2 * 5 + 1

        Scanner scanner = new Scanner(System.in);
        // считываем новое число
        int number = scanner.nextInt(); // number = 5
        // берем остаток от деления на 2 и кладем его в переменную mod
        int mod = number % 2; // 5 % 2 = 1
        // проверяем, равен ли mod нулю, если равен - true, если нет - false
        // значение кладем в result
        boolean result = (mod == 0); // 1 == 0 -> false
        // вывод результата
        System.out.println(result);
    }
}