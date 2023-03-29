import java.util.Scanner;

public class Main_V2 {
    // если число четное - делим на два, если нечетное - прибавляем 1
    // выводим число
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // считываем число
        int number = scanner.nextInt();
        // берем остаток от деления на 2
        int mod = number % 2;
        // применим операцию ==,
        // результат которой будет true,
        // если операнд слева и справа эквивалентны

        // ==, <=, >=, !=, <, >
        if (mod == 0) {
            number = number / 2;
        } else {
            number = number + 1;
        }
        // выводим число
        System.out.println(number);
    }
}
